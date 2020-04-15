package com.example.gradproject.permissions

import android.annotation.SuppressLint
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager

class LocationProvider {
    lateinit var gpsManager: LocationManager
    val MIN_TIME_BETWEEN_UPDATES: Long = 1000
    val MIN_DISTANCE_BETWEEN_UPDATES = .5F

    @SuppressLint("MissingPermission")
    fun GetMyLocation(locationListener: LocationListener): Location? {

        val gpsEnabled =
            gpsManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
        val networkEnabled =
            gpsManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)

        if (!gpsEnabled && !networkEnabled) {
            return null
        }

        val provider = if (gpsEnabled) LocationManager.GPS_PROVIDER
        else LocationManager.NETWORK_PROVIDER

        var myLocation = gpsManager.getLastKnownLocation(provider)


        if (locationListener != null) {
            gpsManager.requestLocationUpdates(
                provider, MIN_TIME_BETWEEN_UPDATES,
                MIN_DISTANCE_BETWEEN_UPDATES, locationListener
            )
        }

        if (myLocation == null) {
            myLocation = GetBestLastKnownLocation()
        }

        return myLocation

    }

    @SuppressLint("MissingPermission")
    private fun GetBestLastKnownLocation(): Location? {

        val providers = gpsManager.allProviders
        var bestLocation: Location? = null

        for (s: String in providers) {
            val loc = gpsManager.getLastKnownLocation(s)
            if (bestLocation == null) bestLocation = loc
            if (loc == null || bestLocation == null) continue
            if (loc.time > bestLocation.time) {
                bestLocation = loc
            }
        }

        return bestLocation

    }
}
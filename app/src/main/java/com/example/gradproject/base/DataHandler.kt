package com.example.gradproject.base

import android.content.Context
import android.content.SharedPreferences

class DataHandler {
    companion object {
        private lateinit var sharedPreferences: SharedPreferences
        private val preferencesName = "app-prefrences"

        fun init(context: Context) {
            sharedPreferences = context.getSharedPreferences(preferencesName,Context.MODE_PRIVATE)
        }

        fun getString(key:String, defValue:String):String?{
            return sharedPreferences.getString(key, defValue)
        }

        fun getInt(key:String, defValue:Int):Int?{
            return sharedPreferences.getInt(key, defValue)
        }

        fun saveString(key:String, value:String?){
            val editor=sharedPreferences.edit()
            editor.putString(key,value)
            editor.apply()
        }

        fun saveInt(key:String, value:Int){
            val editor=sharedPreferences.edit()
            editor.putInt(key,value)
            editor.apply()
        }

        fun removeAllData() {
            sharedPreferences.edit().clear().apply()
        }

    }

}
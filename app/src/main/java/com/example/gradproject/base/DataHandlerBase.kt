package com.example.gradproject.base

import android.app.Application

class DataHandlerBase : Application(){

    override fun onCreate() {
        super.onCreate()
        DataHandler.init(this)
    }
}
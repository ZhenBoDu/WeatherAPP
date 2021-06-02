package com.weatherapp.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import java.lang.Appendable

class SunnyWeatherApplication : Application() {
    companion object {
        const val TOKEN = "HM3Nj4VMMukrGVQK"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
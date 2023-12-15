package com.example.notes

import android.app.Application
import org.koin.core.context.startKoin

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {  }
    }
}
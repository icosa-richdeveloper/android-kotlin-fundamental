package com.example.android.dessertclicker

import android.app.Application

class ClickerApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}
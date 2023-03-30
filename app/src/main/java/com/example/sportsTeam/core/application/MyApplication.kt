package com.example.sportsTeam.core.application

import android.app.Application
import com.example.sportsTeam.core.koin.getListOfModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(applicationContext)
            modules(getListOfModules())
        }
    }
}
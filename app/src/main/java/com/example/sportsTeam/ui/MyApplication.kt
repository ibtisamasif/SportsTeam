package com.example.sportsTeam.ui

import android.app.Application
import androidx.activity.compose.setContent
import com.example.sportsteam2.core.koin.getListOfModules
import org.koin.android.ext.android.inject
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
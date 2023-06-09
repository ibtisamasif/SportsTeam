package com.example.sportsTeam.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {
   private val viewModel: MainViewModel by inject ()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(viewModel = viewModel)
        }
    }
}
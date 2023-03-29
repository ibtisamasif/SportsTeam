package com.example.sportsteam2.core.base.modules

import com.example.sportsteam2.core.base.models.MainRepo
import com.example.sportsTeam.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val accountViewModelModule = module {
    viewModel { MainViewModel(get()) }
}

val accountRepoModule = module {
    factory { MainRepo(get()) }
}
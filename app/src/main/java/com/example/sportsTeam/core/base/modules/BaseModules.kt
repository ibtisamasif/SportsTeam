package com.example.sportsteam2.core.base.modules

import com.example.sportsteam2.core.base.models.BaseRepo
import com.example.sportsteam2.core.base.viewmodels.BaseViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val baseViewModelModule = module {
    viewModel { BaseViewModel(get()) }
}

val baseRepoModule = module {
    factory { BaseRepo(get()) }
}
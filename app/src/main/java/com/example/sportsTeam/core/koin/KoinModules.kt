package com.example.sportsteam2.core.koin


import com.example.sportsteam2.core.base.modules.accountRepoModule
import com.example.sportsteam2.core.base.modules.accountViewModelModule
import com.example.sportsteam2.core.base.modules.baseRepoModule
import com.example.sportsteam2.core.base.modules.baseViewModelModule
import com.example.sportsteam2.core.koin.modules.apiModule
import com.example.sportsteam2.core.modules.retrofitModule
import org.koin.core.module.Module


fun getListOfModules(): List<Module> {

    return (listOf(
        apiModule,
        accountRepoModule,
        accountViewModelModule,
        retrofitModule,
        baseRepoModule,
        baseViewModelModule
    ))
}
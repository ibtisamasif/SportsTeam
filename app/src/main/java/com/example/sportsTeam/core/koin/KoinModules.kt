package com.example.sportsTeam.core.koin


import com.example.sportsTeam.core.base.modules.accountRepoModule
import com.example.sportsTeam.core.base.modules.accountViewModelModule
import com.example.sportsTeam.core.base.modules.baseRepoModule
import com.example.sportsTeam.core.base.modules.baseViewModelModule
import com.example.sportsTeam.core.koin.modules.apiModule
import com.example.sportsTeam.core.modules.retrofitModule
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
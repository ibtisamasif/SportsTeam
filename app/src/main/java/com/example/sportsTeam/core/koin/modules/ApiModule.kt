package com.example.sportsTeam.core.koin.modules

import android.content.Context
import com.example.sportsTeam.core.ApiManager
import com.example.sportsTeam.core.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {

    fun getApiInterface(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    fun getAPIManger(
        apiInterface: ApiService,
        context: Context,
    ): ApiManager {
        return ApiManager(apiInterface)
    }

    single { getAPIManger(get(), get()) }
    single { getApiInterface(get()) }
}
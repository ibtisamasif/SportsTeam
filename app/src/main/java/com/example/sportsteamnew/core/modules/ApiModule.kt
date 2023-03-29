package com.example.sportsteamnew.core.modules

//import android.content.Context
//import com.example.sportsteamnew.core.ApiService
//import com.example.sportsteamnew.core.koin.ApiManager
//import org.koin.dsl.module
//import retrofit2.Retrofit
//
//val apiModule = module {
//
//    fun getApiInterface(retrofit: Retrofit): ApiService {
//        return retrofit.create(ApiService::class.java)
//    }
//
//    fun getAPIManger(
//        apiInterface: ApiService,
//        context: Context,
//    ): ApiManager {
//        return ApiManager(apiInterface, context)
//    }
//
//    single { getAPIManger(get(), get()) }
//    single { getApiInterface(get()) }
//}
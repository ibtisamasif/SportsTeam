package com.example.sportsteamnew.core.modules

//import com.google.gson.FieldNamingPolicy
//import com.google.gson.Gson
//import com.google.gson.GsonBuilder
//import okhttp3.OkHttpClient
//import org.koin.dsl.module
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//
//val retrofitModule = module {
//
//    fun getGson(): Gson {
//        return GsonBuilder().setLenient().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create()
//    }
//
//    fun getRetrofit(
//        factory: Gson,
//        client: OkHttpClient,
//    ): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl("https://www.thesportsdb.com/api/v1/json/")
//            .addConverterFactory(GsonConverterFactory.create(factory))
//            .client(client)
//            .build()
//    }
//
//    single { getGson() }
//    single { getRetrofit(get(), get()) }
//}
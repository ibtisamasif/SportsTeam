package com.example.sportsteam2.core

import com.example.sportsteam2.core.koin.providers.models.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("50130162/searchplayers.php")
    suspend fun searchPlayers(
        @Query("p") query: String,
    ): SearchResponse
}
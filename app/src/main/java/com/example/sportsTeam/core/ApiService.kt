package com.example.sportsTeam.core

import com.example.sportsTeam.core.koin.providers.models.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("50130162/searchplayers.php")
    suspend fun searchPlayers(
        @Query("p") query: String,
    ): SearchResponse
}
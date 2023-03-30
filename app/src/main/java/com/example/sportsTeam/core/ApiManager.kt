package com.example.sportsTeam.core

import com.example.sportsTeam.core.koin.providers.models.SearchResponse

class ApiManager(private val apiInterface: ApiService) {

    suspend fun searchPlayers(query: String): Resource<SearchResponse> {
        return try {
            Resource.Success(
                apiInterface.searchPlayers(
                    query = query,
                )
            )
        } catch (e: Exception) {
            Resource.Error(e.message.toString())
        }
    }

}

package com.example.sportsteam2.core

import android.content.Context
import com.example.sportsteam2.core.koin.providers.models.SearchResponse

class ApiManager(private val apiInterface: ApiService, val context: Context) {

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

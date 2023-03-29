package com.example.sportsteamnew.core.koin

import android.content.Context
import com.example.sportsteamnew.core.ApiService
import com.example.sportsteamnew.core.Resource

class ApiManager(private val apiInterface: ApiService, val context: Context) {

    suspend fun searchPlayers(query: String): Resource<SearchResponse> {
        return try {
            Resource.Success(
                apiInterface.searchPlayers(
                    query = query,
                    apiKey = "50130162"
                )
            )
        } catch (e: Exception) {
            Resource.Error(e.message.toString())
        }
    }

}

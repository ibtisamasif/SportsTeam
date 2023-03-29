package com.example.sportsteam2.core.base.models

import com.example.sportsteam2.core.ApiManager
import com.example.sportsteam2.core.Resource
import com.example.sportsteam2.core.koin.providers.models.SearchResponse


class MainRepo(
    private val apiManager: ApiManager

) : BaseRepo(apiManager) {
    suspend fun searchPlayers(query: String): Resource<SearchResponse> {
        return apiManager.searchPlayers(query)
    }
}
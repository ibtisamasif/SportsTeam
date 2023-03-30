package com.example.sportsTeam.core.base.models

import com.example.sportsTeam.core.ApiManager
import com.example.sportsTeam.core.Resource
import com.example.sportsTeam.core.koin.providers.models.SearchResponse


class MainRepo(
    private val apiManager: ApiManager

) : BaseRepo(apiManager) {
    suspend fun searchPlayers(query: String): Resource<SearchResponse> {
        return apiManager.searchPlayers(query)
    }
}
package com.example.sportsTeam.ui

import androidx.lifecycle.viewModelScope
import com.example.sportsTeam.core.Resource
import com.example.sportsTeam.core.base.models.MainRepo
import com.example.sportsTeam.core.base.viewmodels.BaseViewModel
import com.example.sportsTeam.core.koin.providers.models.SearchResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel(private val repository: MainRepo) : BaseViewModel(repository) {
    private val playersObserver = MutableStateFlow<Resource<SearchResponse>>(Resource.Loading())

    fun searchPlayers(
        query: String,
        returnApiResponse: (Resource<SearchResponse>) -> Unit
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            playersObserver.emit(Resource.Loading())
            when (val apiResponse = repository.searchPlayers(query)) {
                is Resource.Loading -> {}
                is Resource.Success -> {
                    playersObserver.emit(apiResponse)
                    returnApiResponse.invoke(apiResponse)
                }
                is Resource.Error -> {
                    playersObserver.emit(Resource.Error(apiResponse.message))
                }
            }
        }
    }
}

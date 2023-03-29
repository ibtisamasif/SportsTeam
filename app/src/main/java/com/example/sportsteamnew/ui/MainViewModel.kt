package com.example.sportsteamnew.ui

//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.sportsteamnew.core.MainRepository
//import com.example.sportsteamnew.core.Resource
//import com.example.sportsteamnew.core.koin.SearchResponse
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.launch
//
//class MainViewModel(private val repository: MainRepository) : ViewModel() {
//    private val playersObserver = MutableStateFlow<Resource<SearchResponse>>(Resource.Loading())
//    val players: MutableStateFlow<Resource<SearchResponse>> = playersObserver
//
//    fun searchPlayers(
//        query: String,
//        returnApiResponse: (Resource<SearchResponse>) -> Unit
//    ) {
//        viewModelScope.launch(Dispatchers.IO) {
//            playersObserver.emit(Resource.Loading())
//            when (val apiResponse = repository.searchPlayers(query)) {
//                is Resource.Loading -> {}
//                is Resource.Success -> {
//                    playersObserver.emit(apiResponse)
//                    returnApiResponse.invoke(apiResponse)
//                }
//                is Resource.Error -> {
//                    playersObserver.emit(Resource.Error(apiResponse.message))
//                }
//            }
//        }
//    }
//}

package com.example.sportsteamnew.ui

import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.sportsteamnew.core.Resource

//@Composable
//fun MainScreen(viewModel: MainViewModel) {
//    val context = LocalContext.current
//    val query = remember { mutableStateOf("") }
//
//    Column(modifier = Modifier.padding(16.dp)) {
//        TextField(
//            value = query.value,
//            onValueChange = { query.value = it },
//            modifier = Modifier.fillMaxWidth(),
//            placeholder = { Text("Search Players") },
//            singleLine = true,
//            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
//            keyboardActions = KeyboardActions(
//                onSearch = {
//                    if (query.value.isNotBlank()) {
//                        viewModel.searchPlayers(query.value) { apiResponse ->
//                            when (apiResponse) {
//                                is Resource.Success -> {
//                                    val players = apiResponse.data
//                                }
//                                is Resource.Error -> {
//                                }
//                                is Resource.Loading -> {
////                    progressBar()
//                                }
//                            }
//                        }
//                        hideKeyboard(context)
//                    }
//                }
//            )
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        viewModel.searchPlayers(query.value) { apiResponse ->
//            when (apiResponse) {
//                is Resource.Success -> {
//                    val players = apiResponse.data
//                }
//                is Resource.Error -> {
//                }
//                is Resource.Loading -> {
////                    progressBar()
//                }
//            }
//        }
//    }
//}

//@Composable
//fun progressBar() {
//    CircularProgressIndicator(
//        modifier = Modifier.then(Modifier.size(32.dp))
//    )
//}
//
//fun hideKeyboard(context: Context) {
//    val inputMethodManager =
//        context.getSystemService(AppCompatActivity.INPUT_METHOD_SERVICE) as InputMethodManager
//    inputMethodManager.hideSoftInputFromWindow((context as AppCompatActivity).currentFocus?.windowToken, 0)
//}

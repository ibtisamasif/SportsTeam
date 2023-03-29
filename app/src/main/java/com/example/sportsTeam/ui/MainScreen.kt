package com.example.sportsTeam.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.sportsteam2.core.Resource
import com.example.sportsteam2.core.koin.providers.models.Player

@Composable
fun MainScreen(viewModel: MainViewModel) {
    var player: Player? = null
    val query = remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = query.value,
            onValueChange = { query.value = it },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onSearch = {
                    if (query.value.isNotBlank()) {
                        viewModel.searchPlayers(query.value) { apiResponse ->
                            when (apiResponse) {
                                is Resource.Success -> {
                                    player = apiResponse.data.players[0]
                                }
                                is Resource.Error -> {
                                }
                                is Resource.Loading -> {
//                    progressBar()
                                }
                            }
                        }
                    }
                }
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        viewModel.searchPlayers(query.value) { apiResponse ->
            when (apiResponse) {
                is Resource.Success -> {
                    player = apiResponse.data.players[0]
                }
                is Resource.Error -> {
                }
                is Resource.Loading -> {
//                    progressBar()
                }
            }
        }
    }
    Box(modifier = Modifier.fillMaxSize()){
        player?.let { PlayerItem(it) }
    }
}

@Composable
fun PlayerItem(player: Player) {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            // display player details
            Text(
                text = player.strPlayer ?: "",
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
            )
            Text(
                text = player.strNationality ?: "",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}




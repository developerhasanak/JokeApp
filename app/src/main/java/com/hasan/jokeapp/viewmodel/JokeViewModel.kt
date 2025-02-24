package com.hasan.jokeapp.viewmodel

import android.annotation.SuppressLint
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hasan.jokeapp.model.JokeData
import com.hasan.jokeapp.service.JokeApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@SuppressLint("MutableCollectionMutableState")
class JokeViewModel: ViewModel(){


    var jokeList by mutableStateOf<JokeData>(JokeData())

    fun getJokeList(){
        viewModelScope.launch(Dispatchers.IO) {
            jokeList = JokeApi.retrofitService.getJokeList()

        }
    }
}
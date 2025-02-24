package com.hasan.jokeapp.service


import com.hasan.jokeapp.model.JokeData
import com.hasan.jokeapp.model.JokeDataItem
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private const val BASE_URL = "https://raw.githubusercontent.com/atilsamancioglu/"

interface JokeApiService {
    @GET("ProgrammingJokesJSON/refs/heads/main/jokes.json")
    suspend fun getJokeList(): JokeData
}

private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()


object JokeApi{
    val retrofitService: JokeApiService by lazy {
        retrofit.create(JokeApiService::class.java)
    }
}
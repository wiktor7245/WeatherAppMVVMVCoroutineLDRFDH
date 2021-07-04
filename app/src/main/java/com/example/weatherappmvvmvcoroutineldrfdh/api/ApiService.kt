package com.example.weatherappmvvmvcoroutineldrfdh.api

import com.example.weatherappmvvmvcoroutineldrfdh.model.Weather
import com.example.weatherappmvvmvcoroutineldrfdh.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/${Constants.CITY}")
    suspend fun getWeather():Response<Weather>

}
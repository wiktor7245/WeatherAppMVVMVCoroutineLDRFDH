package com.example.weatherappmvvmvcoroutineldrfdh.repository

import com.example.weatherappmvvmvcoroutineldrfdh.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService){
        suspend fun getWeather() = apiService.getWeather()
}
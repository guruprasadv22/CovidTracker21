package com.example.coronavirustrackingapp

import retrofit2.Call
import retrofit2.http.GET

interface CovidService {

    @GET( "us/daily.json")
    //@GET("/total.json")
    fun getNationalData(): Call<List<CovidData>>

    @GET( "states/daily.json")
    //@GET("/state_data.json")
    fun getStatesData(): Call<List<CovidData>>
}
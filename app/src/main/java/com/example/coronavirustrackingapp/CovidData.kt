package com.example.coronavirustrackingapp

//import com.google.gson.annotations.SerializedName
import java.util.*

data class CovidData{
    val dataChecked: Date,
    val positiveIncrease: Int,
    val negativeIncrease: Int,
    val deathIncrease: Int,
    val state: String,

}
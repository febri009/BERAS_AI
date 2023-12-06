package com.example.berasai.data.retrofit

import com.example.beras_ai.data.model.DataPrices
import com.example.beras_ai.data.model.PricesResponse
import com.example.beras_ai.data.model.TengkulaksResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("prices")
    fun getPrices(): Call<PricesResponse>

    @GET("tengkulaks")
    fun getTengkulaks():Call<TengkulaksResponse>

    @GET("prices")
    fun getDate():Call<DataPrices>
}
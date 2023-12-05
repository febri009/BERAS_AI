package com.example.berasai.data.retrofit

import com.example.beras_ai.data.model.TengkulaksResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("tengkulaks")
    fun getTengkulaks():Call<TengkulaksResponse>
}
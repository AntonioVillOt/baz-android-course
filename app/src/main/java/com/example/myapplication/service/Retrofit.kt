package com.example.myapplication.service

import com.example.myapplication.repository.WebService
import com.example.myapplication.repository.okHttp
import com.example.myapplication.util.AppConstants
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient{
    val webservice by lazy{
        Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .client(okHttp.build())
            .build().create(WebService::class.java)
    }
}
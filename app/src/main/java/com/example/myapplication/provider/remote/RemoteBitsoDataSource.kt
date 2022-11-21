package com.example.myapplication.provider.remote

import com.example.myapplication.util.AppConstants
import com.example.myapplication.model.BookResponse
import com.example.myapplication.model.OrderBooksResponse
import com.example.myapplication.model.TickerResponse
import com.example.myapplication.repository.WebService
import retrofit2.Retrofit

class RemoteBitsoDataSource(private val webService: WebService) {


    suspend fun getTicker(): BookResponse {
        return webService.getAvailableBook(AppConstants.API_KEY)
    }

    suspend fun getOrderBook(): BookResponse {
        return webService.getAvailableBook(AppConstants.API_KEY)
    }

    suspend fun getAvailableBook(): BookResponse {
        return webService.getAvailableBook(AppConstants.API_KEY)
    }

}

class RemoteBitsoDataSourceRx(private val retro: Retrofit) {

}
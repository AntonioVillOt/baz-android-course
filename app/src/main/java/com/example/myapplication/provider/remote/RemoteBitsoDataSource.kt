package com.example.myapplication.provider.remote

import com.example.myapplication.util.AppConstants
import com.example.myapplication.model.BookResponse
import com.example.myapplication.model.OrderBooksModel
import com.example.myapplication.model.TickerPayloadResponse
import com.example.myapplication.repository.WebService

class RemoteBitsoDataSource(private val webService: WebService) {


    suspend fun getTicker(): TickerPayloadResponse {
        return webService.getTicker(AppConstants.API_KEY)
    }

    suspend fun getOrderBook(): OrderBooksModel {
        return webService.getOrderBook(AppConstants.API_KEY)
    }

    suspend fun getAvailableBook(): BookResponse {
        return  webService.getAvailableBook(AppConstants.API_KEY)
    }

}
package com.example.myapplication.provider.remote

import com.example.myapplication.util.AppConstants
import com.example.myapplication.model.BookResponse
import com.example.myapplication.model.OrderBooksResponse
import com.example.myapplication.repository.WebService
import com.example.myapplication.util.isNull
import io.reactivex.rxjava3.core.Single


class RemoteBitsoDataSource(private val webService: WebService) {

    suspend fun getAvailableBook(): BookResponse {
        return webService.getAvailableBook(AppConstants.API_KEY)
    }

    suspend fun getTicker(): BookResponse {
        if (getTicker().results.isNull()) {
            return getTicker()
        } else {
            return webService.getAvailableBook(AppConstants.API_KEY)
        }
    }

    fun getOrderBook(): Single<List<OrderBooksResponse>> {

        if (getOrderBook().isNull()) {
            return getOrderBook()
        } else {
            return webService.getOrderBook(AppConstants.API_KEY)
        }
    }

}

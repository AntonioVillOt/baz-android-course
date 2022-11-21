package com.example.myapplication.repository

import com.example.myapplication.model.BookResponse
import com.example.myapplication.model.OrderBooksModel
import com.example.myapplication.model.TickerPayloadResponse

interface BitsoRepository {

    suspend fun getTicker(): TickerPayloadResponse
    suspend fun getOrderBook(): OrderBooksModel
    suspend fun getAvailableBook(): BookResponse


}
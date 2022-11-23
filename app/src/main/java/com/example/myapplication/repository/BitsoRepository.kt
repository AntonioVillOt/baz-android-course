package com.example.myapplication.repository

import com.example.myapplication.model.BookResponse

interface BitsoRepository {

    suspend fun getTicker(): BookResponse
    suspend fun getOrderBook(): BookResponse
    suspend fun getAvailableBook(): BookResponse


}
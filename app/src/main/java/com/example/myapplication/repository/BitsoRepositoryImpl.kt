package com.example.myapplication.repository

import com.example.myapplication.model.BookResponse
import com.example.myapplication.model.OrderBooksModel
import com.example.myapplication.model.TickerPayloadResponse
import com.example.myapplication.provider.remote.RemoteBitsoDataSource

class BitsoRepositoryImpl(private  val dataSource: RemoteBitsoDataSource): BitsoRepository {

    override suspend fun getTicker(): TickerPayloadResponse = dataSource.getTicker()

    override suspend fun getOrderBook(): OrderBooksModel = dataSource.getOrderBook()

    override suspend fun getAvailableBook(): BookResponse = dataSource.getAvailableBook()

}
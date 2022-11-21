package com.example.myapplication.repository

import com.example.myapplication.model.BookResponse
import com.example.myapplication.provider.local.LocalBitsoDataSource

class BitsoRepositoryImplRx(
    private val dataSourceLocal: LocalBitsoDataSource
) : BitsoRepository {
    override suspend fun getAvailableBook(): BookResponse {
        return dataSourceLocal.getAvailableBook()
    }

    override suspend fun getTicker(): BookResponse {
        return dataSourceLocal.getTicker()
    }

    override suspend fun getOrderBook(): BookResponse {
        return dataSourceLocal.getOrderBooks()
    }
}
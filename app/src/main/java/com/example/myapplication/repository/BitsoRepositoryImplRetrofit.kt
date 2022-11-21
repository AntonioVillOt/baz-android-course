package com.example.myapplication.repository

import com.example.myapplication.model.BookResponse
import com.example.myapplication.model.toBookEntity
import com.example.myapplication.provider.local.LocalBitsoDataSource
import com.example.myapplication.provider.remote.RemoteBitsoDataSource
import com.example.myapplication.util.InternetCheck

class BitsoRepositoryImplRetrofit(
    private val dataSourceRemote: RemoteBitsoDataSource,
    private val dataSourceLocal: LocalBitsoDataSource
) : BitsoRepository {

    override suspend fun getAvailableBook(): BookResponse {
        return if (InternetCheck.isNetworkAvailable()) {
            dataSourceRemote.getAvailableBook().results.forEach { book ->
                dataSourceLocal.safeBook(book.toBookEntity("availablebook"))
            }
            dataSourceLocal.getAvailableBook()
        } else {
            dataSourceLocal.getAvailableBook()
        }
    }

    override suspend fun getTicker(): BookResponse {
        return if (InternetCheck.isNetworkAvailable()) {
            dataSourceRemote.getTicker().results.forEach { book ->
                dataSourceLocal.safeBook(book.toBookEntity("orderbook"))
            }
            dataSourceLocal.getAvailableBook()
        } else {
            dataSourceLocal.getAvailableBook()
        }
    }

    override suspend fun getOrderBook(): BookResponse {
        return dataSourceLocal.getOrderBooks()
    }
}



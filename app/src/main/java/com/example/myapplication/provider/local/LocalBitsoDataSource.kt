package com.example.myapplication.provider.local

import com.example.myapplication.model.BookEntity
import com.example.myapplication.model.BookResponse
import com.example.myapplication.model.toBookList

class LocalBitsoDataSource(private val bookDao: BookDao) {

    suspend fun getAvailableBook(): BookResponse {
        return bookDao.getALLBooks().filter{it.book_type == "availablebook"}.toBookList()
    }

    suspend fun  getOrderBooks(): BookResponse {
        return bookDao.getALLBooks().filter{it.book_type == "orderbook"}.toBookList()
    }

    suspend fun getTicker(): BookResponse {
        return bookDao.getALLBooks().filter{it.book_type == "ticker"}.toBookList()
    }

    suspend fun safeBook(book: BookEntity){
        bookDao.saveBook(book)
    }
}
package com.example.myapplication.data.local

import com.example.myapplication.data.model.BookEntity
import com.example.myapplication.data.model.BookResponse
import com.example.myapplication.data.model.toBookList

class LocalBitsoDataSource(private val bookDao: BookDao) {

    suspend fun getAvailableBook(): BookResponse {
        return bookDao.getALLBooks().filter{it.book_type == "availablebook"}.toBookList()
    }

    suspend fun  getOrderBooks(): BookResponse{
        return bookDao.getALLBooks().filter{it.book_type == "orderbook"}.toBookList()
    }

    suspend fun getTicker(): BookResponse{
        return bookDao.getALLBooks().filter{it.book_type == "ticker"}.toBookList()
    }

    suspend fun safeBook(book: BookEntity){
        bookDao.saveBook(book)
    }
}
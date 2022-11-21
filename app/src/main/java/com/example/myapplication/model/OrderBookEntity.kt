package com.example.myapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class OrderBookEntity(
    @PrimaryKey var book: String = "",
    @ColumnInfo(name = "price") var price: Double? = 0.0,
    @ColumnInfo(name = "amount") var amount: Double? = 0.0,
    @ColumnInfo(name = "orderbook_type") val orderbook_type: String = ""
)


fun OrderBookEntity.toOrderBook(): OrderBook = OrderBook(
    this.book,
    this.price,
    this.amount,
    this.orderbook_type
)

fun OrderBook.toOrderBookEntity(bookType: String): OrderBookEntity = OrderBookEntity(
    this.book.toString(),
    this.price,
    this.maximumAmount,
    orderbook_type = bookType
)
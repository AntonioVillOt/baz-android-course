package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class OrderBooksResponse(
    @SerializedName("payload") val payload: List<OrderBook>? = null,
    @SerializedName("success") val success: Boolean? = false,
    @SerializedName("asks") val asks: List<OrderBook>? = null,
    @SerializedName("binds") val binds: List<OrderBook>? = null
)

data class OrderBook(
    @SerializedName("book") var book: String? = "",
    @SerializedName("price") var price: Double? = 0.0,
    @SerializedName("amount") var maximumAmount: Double? = 0.0,
    val orderbookType: String
)
package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class BookResponse(
    @SerializedName("payload") val results: List<Book> = listOf(),
    @SerializedName("success") val success: Boolean? = false,
)

data class Book(
    @SerializedName("book") var book: String = "",
    @SerializedName("minimum_amount") var minimumAmount: Double? = 0.0,
    @SerializedName("maximum_amount") var maximumAmount: Double? = 0.0,
    @SerializedName("minimum_price") var minimumPrice: Double? = 0.0,
    @SerializedName("maximum_price") var maximumPrice: Double? = 0.0,
    @SerializedName("minimum_value") var minimumValue: Double? = 0.0,
    @SerializedName("maximum_value") var maximumValue: Double? = 0.0,
    val book_type: String = ""
)



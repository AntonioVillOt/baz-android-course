package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class TickerResponse(

    @SerializedName("payload") val payload: List<Ticker>? = null,
    @SerializedName("success") val success: Boolean = false,
)

data class Ticker(

    @SerializedName("book") var book: String = "",
    @SerializedName("volume") var volume: Double? = 0.0,
    @SerializedName("high") var high: Double? = 0.0,
    @SerializedName("last") var last: Double? = 0.0,
    @SerializedName("low") var low: Double? = 0.0,
    @SerializedName("vwap") var vwap: Double? = 0.0,
    @SerializedName("ask") var ask: Double? = 0.0,
    @SerializedName("bid") var bid: Double? = 0.0,

    )
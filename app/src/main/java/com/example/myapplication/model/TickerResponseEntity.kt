package com.example.myapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TickerEntity(
    @PrimaryKey var book: String = "",
    @ColumnInfo(name = "volume") var volume: Double? = 0.0,
    @ColumnInfo(name = "high") var high: Double? = 0.0,
    @ColumnInfo(name = "last") var last: Double? = 0.0,
    @ColumnInfo(name = "low") var low: Double? = 0.0,
    @ColumnInfo(name = "vwap") var vwap: Double? = 0.0,
    @ColumnInfo(name = "ask") var ask: Double? = 0.0,
    @ColumnInfo(name = "bid") val bid: Double? = 0.0,

)


fun TickerEntity.toTicker(): Ticker = Ticker(
    this.book,
    this.volume,
    this.bid,
    this.high,
    this.low,
    this.last,
    this.volume,
)

fun Ticker.toTickerEntity(): TickerEntity = TickerEntity(
    this.book,
    this.volume,
    this.bid,
    this.high,
    this.low,
    this.last,
    this.volume,
)
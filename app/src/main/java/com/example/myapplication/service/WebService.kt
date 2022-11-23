package com.example.myapplication.repository

import com.example.myapplication.model.BookResponse
import com.example.myapplication.model.OrderBooksResponse
import com.example.myapplication.model.TickerResponse
import io.reactivex.rxjava3.core.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WebService {

    @GET("available_books/")
    suspend fun getAvailableBook(@Query("api_key") apiKey: String): BookResponse

    @GET("ticker/")
    suspend fun getTicker(@Query("api_key") apiKey: String): TickerResponse

    @GET("order_book/book")
    fun getOrderBook(@Path("api_key")apiKey: String): Single<List<OrderBooksResponse>>

}

private val logger: HttpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
val okHttp: OkHttpClient.Builder = OkHttpClient.Builder().addInterceptor(logger)

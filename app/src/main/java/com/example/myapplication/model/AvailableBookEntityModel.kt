package com.example.myapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BookEntity(
    @PrimaryKey var book: String = "",
    @ColumnInfo(name = "minimumAmount") var minimumAmount: Double? = 0.0,
    @ColumnInfo(name = "maximum_amount") var maximumAmount: Double? = 0.0,
    @ColumnInfo(name = "minimum_price") var minimumPrice: Double? = 0.0,
    @ColumnInfo(name = "maximum_price") var maximumPrice: Double? = 0.0,
    @ColumnInfo(name = "minimum_value") var minimumValue: Double? = 0.0,
    @ColumnInfo(name = "maximum_value") var maximumValue: Double? = 0.0,
    @ColumnInfo(name = "boo_type") val book_type: String = ""
)

fun List<BookEntity>.toBookList(): BookResponse {
    val resultList = mutableListOf<Book>()
    this.forEach { bookEntity ->
        resultList.add(bookEntity.toBook())
    }
    return BookResponse(resultList)
}

fun BookEntity.toBook(): Book = Book(
    this.book,
    this.minimumAmount,
    this.maximumAmount,
    this.minimumPrice,
    this.maximumPrice,
    this.minimumValue,
    this.maximumValue,
    this.book_type
)

fun Book.toBookEntity(bookType: String): BookEntity = BookEntity(
    this.book,
    this.minimumAmount,
    this.maximumAmount,
    this.minimumPrice,
    this.maximumPrice,
    this.minimumValue,
    this.maximumValue,
    book_type = bookType
)

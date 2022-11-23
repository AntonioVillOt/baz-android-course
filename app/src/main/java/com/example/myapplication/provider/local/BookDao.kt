package com.example.myapplication.provider.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.model.BookEntity

@Dao
interface BookDao{
    @Query("SELECT * FROM bookentity")
    suspend fun getALLBooks(): List<BookEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveBook(book: BookEntity)

}
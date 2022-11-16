package com.example.myapplication.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.data.model.BookEntity

@Dao
interface BookDao{
    @Query("SELECT * FROM bookentity")
    suspend fun getALLBooks(): List<BookEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveBook(book: BookEntity)

}
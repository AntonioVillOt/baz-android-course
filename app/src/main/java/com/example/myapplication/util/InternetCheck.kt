package com.example.myapplication.util

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import java.io.IOException
import java.net.InetSocketAddress
import java.net.Socket

object InternetCheck {

    suspend fun isNetworkAvailable() = coroutineScope {
        return@coroutineScope try {
            val sock = Socket()
            val socketAddress = InetSocketAddress("8.8.8.8", 53)
            withContext(Dispatchers.IO) {
                sock.connect(socketAddress, 2000)
                Log.d("result", "internetcheck = ${coroutineScope { true }}")

            }
            withContext(Dispatchers.IO) {
                sock.close()
            }
            true
        }catch (e: IOException){
            false
        }
    }

}
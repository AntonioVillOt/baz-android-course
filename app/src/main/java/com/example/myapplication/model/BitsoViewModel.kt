package com.example.myapplication.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.myapplication.util.core.Resource
import com.example.myapplication.repository.BitsoRepository
import kotlinx.coroutines.Dispatchers

class BitsoViewModel(private val repo: BitsoRepository) : ViewModel() {

    fun fetchAvailableBook() = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.getAvailableBook()))

        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }

    fun fetchTicker() = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.getAvailableBook()))
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }

    fun fetchOrderBook() = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.getAvailableBook()))
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }
}

class BitsoViewModelFactory(private val repo: BitsoRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(BitsoRepository::class.java).newInstance(repo)
    }
}

class BitsoViewModelFactoryRx(private val repo: BitsoRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(BitsoRepository::class.java).newInstance(repo)
    }
}
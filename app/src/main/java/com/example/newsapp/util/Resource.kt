package com.example.newsapp.util

sealed class Resource<T>(
    val data: T? = null,
    val massage: String? = null
){
    class Success<T>(data: T): Resource<T>(data)
    class Error<T>(data: T? = null): Resource<T>(data)
    class Loading<T>: Resource<T>() {

    }
}
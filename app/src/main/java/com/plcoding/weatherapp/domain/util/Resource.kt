package com.plcoding.weatherapp.domain.util

//    https://codechacha.com/ko/kotlin-sealed-classes/ <- sealed class 설명

sealed class Resource<T>(val data:T? = null, val message :String? = null) {
    class Success<T>(data: T?):Resource<T>(data)
    class Error<T>(message: String,data: T?=null):Resource<T>(data,message)

}
package com.example.objectorientedkotlin

import android.util.Log

open class Car {
    open fun start() {
        Log.i("MY_TAG", "Car is starting...")
    }
}
package com.example.objectorientedkotlin

import android.util.Log

class Driver(val name: String) {

    private val limitSpeed = 150

    var currentSpeed = 0

    fun showDetails() {
        Log.i("MY_TAG", "Name of the driver is $name")

        if (currentSpeed < limitSpeed)
            Log.i("MY_TAG", "Keep going! Everything is fine")
        else
            Log.i("MY_TAG", "Stop! You're going really fast")
    }
}
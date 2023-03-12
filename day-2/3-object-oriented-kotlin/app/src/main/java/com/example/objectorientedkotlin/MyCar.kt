package com.example.objectorientedkotlin

import android.util.Log

class MyCar : Car(), SpeedController {

    override fun start() {
        super.start()
        Log.i("MY_TAG", "MyCar is starting...")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}
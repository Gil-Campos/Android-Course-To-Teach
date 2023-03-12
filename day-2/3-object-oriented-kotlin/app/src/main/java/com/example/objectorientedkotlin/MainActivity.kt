package com.example.objectorientedkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Car()
        car.start()

        val driver = Driver("Lewis")
        driver.currentSpeed = 120
        driver.showDetails()

        val myCar = MyCar()
        myCar.start()
    }
}
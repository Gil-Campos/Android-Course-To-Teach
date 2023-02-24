package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userMessage = intent.getStringExtra("USER")
        val name = findViewById<TextView>(R.id.tvSecondActivity)
        name.text = userMessage
    }
}
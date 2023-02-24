package com.example.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.textView)
        val inputField = findViewById<EditText>(R.id.tvName)
        val submitButton = findViewById<Button>(R.id.submitBtn)
        val nextButton = findViewById<Button>(R.id.btnNextActivity)
        var enteredName = ""
        submitButton.setOnClickListener {
            enteredName = inputField.text.toString()
            if (enteredName == "") {
                nextButton.visibility = INVISIBLE
                greetingTextView.text = ""
                Toast.makeText(this, "Enter a valid text", Toast.LENGTH_SHORT).show()
            } else {
                val message = "Welcome $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
                nextButton.visibility = VISIBLE
            }
        }
        nextButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", enteredName)
            startActivity(intent)
        }
    }
}
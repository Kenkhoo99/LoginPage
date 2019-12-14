package com.example.loginpage

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button = findViewById<Button>(R.id.log_in)
        button.paintFlags = button.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        val button1 = findViewById<Button>(R.id.condition)
        button1.paintFlags = button1.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        val button2 = findViewById<Button>(R.id.log_in)
        button2.setOnClickListener{
            val intent = Intent(this, Login1:: class.java)
            startActivity(intent)
        }
    }
}

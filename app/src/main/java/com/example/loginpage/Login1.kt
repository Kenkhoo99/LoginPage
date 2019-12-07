package com.example.loginpage

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        val button = findViewById<Button>(R.id.forgot_password)
        button.paintFlags = button.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        val button1 = findViewById<Button>(R.id.register2_button)
        button1.paintFlags = button1.paintFlags or Paint.UNDERLINE_TEXT_FLAG
    }
}

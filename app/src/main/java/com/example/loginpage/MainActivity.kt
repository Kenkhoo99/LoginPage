package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val button = findViewById<Button>(R.id.login_button)
        button.setOnClickListener{
            val intent = Intent(this, Login1:: class.java)
            startActivity(intent)
        }

        val button1 = findViewById<Button>(R.id.register_button)
        button1.setOnClickListener{
            val intent = Intent(this, Register:: class.java)
            startActivity(intent)
        }



    }
}

package com.ellalearns.weatheryform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class forgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgotpassword)

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val sendButton = findViewById<Button>(R.id.sendButton)
        sendButton.setOnClickListener{
            val intent = Intent(this, otpVerification::class.java)
            startActivity(intent)
        }
    }
}
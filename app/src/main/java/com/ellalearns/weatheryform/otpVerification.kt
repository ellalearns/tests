package com.ellalearns.weatheryform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class otpVerification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_verification)

        val backButton2 = findViewById<ImageView>(R.id.backButton2)
        backButton2.setOnClickListener{
            val intent = Intent(this, forgotPassword::class.java)
            startActivity(intent)
        }

        val verify = findViewById<Button>(R.id.verifyButton)
        verify.setOnClickListener{
            val intent = Intent(this, resetPassword::class.java)
            startActivity(intent)
        }

        val resendOtp = findViewById<TextView>(R.id.resendOtpButton)
        resendOtp.setOnClickListener{
            Toast.makeText(this, "Will be implemented :)", Toast.LENGTH_LONG).show()
        }
    }
}
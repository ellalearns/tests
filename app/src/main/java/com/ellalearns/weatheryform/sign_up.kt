package com.ellalearns.weatheryform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val cancelSignUp = findViewById<ImageView>(R.id.cancelSignUp)
        cancelSignUp.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val termsOfUse = findViewById<TextView>(R.id.termsOfUse)
        termsOfUse.setOnClickListener{
            Toast.makeText(this, "Will be implemented later :)", Toast.LENGTH_LONG).show()
        }

        val signIn = findViewById<TextView>(R.id.signIn)
        signIn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
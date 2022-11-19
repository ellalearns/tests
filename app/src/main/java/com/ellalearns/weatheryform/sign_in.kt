package com.ellalearns.weatheryform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.ellalearns.module2.secondmodule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)

        val forgotPassword1 = findViewById<TextView>(R.id.forgotPassword)
        forgotPassword1.setOnClickListener{
            val intent = Intent(this, forgotPassword::class.java)
            startActivity(intent)
        }

        val signIn = findViewById<Button>(R.id.buttonSignIn)
        signIn.setOnClickListener{
//            Toast.makeText(this, "Will be implemented :)", Toast.LENGTH_LONG).show()
            val intent = Intent(this, secondmodule::class.java)
            startActivity(intent)
        }

        val googleSignIn = findViewById<LinearLayout>(R.id.googleSignIn)
        googleSignIn.setOnClickListener{
            Toast.makeText(this, "Will be implemented :)", Toast.LENGTH_LONG).show()
        }

        val newUser = findViewById<TextView>(R.id.createNewAccount)
        newUser.setOnClickListener{
            val intent = Intent(this, sign_up::class.java)
            startActivity(intent)
        }

    }
}

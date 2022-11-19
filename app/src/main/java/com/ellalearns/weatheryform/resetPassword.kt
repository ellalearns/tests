package com.ellalearns.weatheryform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupWindow

class resetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reset_password)

        val backButton = findViewById<ImageView>(R.id.backButton3)
        backButton.setOnClickListener{
            val intent = Intent(this, forgotPassword::class.java)
            startActivity(intent)
        }

//        val resetButton = findViewById<Button>(R.id.resetButton)
//        val popup = PopupWindow(this)
//        val popup_view = layoutInflater.inflate(R.layout.popuplayout, null)
////        popup.contentView = popup_view
    }
}
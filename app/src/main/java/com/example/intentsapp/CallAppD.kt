package com.example.intentsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide

class CallAppD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_app_d)
        val gif4: ImageView = findViewById(R.id.gif4)
        Glide.with(this).asGif().load("https://c.tenor.com/RIi6ASxHf8UAAAAC/ranbir-kapoor-happy.gif").into(gif4)
        val Callbutton: Button = findViewById(R.id.Callbutton)
        val calltext: TextView = findViewById(R.id.calltext)
        Callbutton.setOnClickListener {
            val number = calltext.text.toString()
            if (number.trim().isEmpty()) {
                Toast.makeText(this, " Please enter the contact to be called", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$number")
                startActivity(intent)
            }
        }
    }
}
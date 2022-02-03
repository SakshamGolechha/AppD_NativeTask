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

class MapAppD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_app_d)
        val gif3: ImageView = findViewById(R.id.gif3)
        Glide.with(this).asGif()
            .load("https://c.tenor.com/hJk9dZo5x18AAAAC/address-give-me-the-address.gif").into(gif3)
        val Search: Button = findViewById(R.id.Search)
        val maptext: TextView = findViewById(R.id.maptext)
        Search.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=${maptext.text.toString()}")
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }
        }
    }
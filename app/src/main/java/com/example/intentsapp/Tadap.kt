package com.example.intentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class Tadap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tadap)
        val gif5: ImageView = findViewById(R.id.gif5)
        Glide.with(this).asGif().load("https://c.tenor.com/9IVmLRYNCrQAAAAC/bhagam-bhag-aeyy-heyy.gif").into(gif5)
    val TadapButton:Button=findViewById(R.id.goback)
        TadapButton.setOnClickListener {
            finish()
        }

    }
}
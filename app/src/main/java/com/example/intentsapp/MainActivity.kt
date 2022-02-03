package com.example.intentsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gif1:ImageView=findViewById(R.id.gif1)
        Glide.with(this).asGif().load("https://c.tenor.com/OoVbm9PgjHwAAAAC/at-your-service-pirates-of-the-carribean.gif").into(gif1)
        val TextButton:Button=findViewById(R.id.TextButton)
        TextButton.setOnClickListener {
            val intent=Intent(this,TextWali::class.java)
            startActivity(intent)
        }
        val MapButton:Button=findViewById(R.id.MapBtn)
        MapButton.setOnClickListener {
            val intent=Intent(this,MapAppD::class.java)
            startActivity(intent)
        }
        val CallButton:Button=findViewById(R.id.CallBtn)
        CallButton.setOnClickListener {
            val intent=Intent(this,CallAppD::class.java)
            startActivity(intent)
        }
        val CrushButton:Button=findViewById(R.id.crush)
        CrushButton.setOnClickListener {
            val intent=Intent(this,Tadap::class.java)
            startActivity(intent)
        }
    }
}
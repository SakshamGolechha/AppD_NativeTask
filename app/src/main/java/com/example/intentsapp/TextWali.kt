package com.example.intentsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide

class TextWali : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_wali)
        val gif2:ImageView=findViewById(R.id.gif2)
        Glide.with(this).asGif().load("https://c.tenor.com/zcDjFxw_BLMAAAAM/daffy-duck-texting.gif").into(gif2)
        val LetsGo:Button=findViewById(R.id.LetsGo)
        val textbox:TextView=findViewById(R.id.textbox)
        LetsGo.setOnClickListener {
            val s=textbox.text.toString()
            if(s.trim().isEmpty()){
                Toast.makeText(this,"Enter some text",Toast.LENGTH_SHORT).show()
            }else {
                val shareIntent = Intent()
                shareIntent.action = Intent.ACTION_SEND
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, s);
                startActivity(Intent.createChooser(shareIntent, "Share via"))
            }
        }
    }
}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openWebsiteButton = findViewById<Button>(R.id.open_website_button)
        val shareTextButton = findViewById<Button>(R.id.share_text_button)
        val url = findViewById<EditText>(R.id.url_field)
        val text = findViewById<EditText>(R.id.text_field)

        openWebsiteButton.setOnClickListener()
    }
}



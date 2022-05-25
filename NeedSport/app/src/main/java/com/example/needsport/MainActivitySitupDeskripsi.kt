package com.example.needsport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivitySitupDeskripsi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_situp_deskripsi)

        val actionBar = supportActionBar
        actionBar!!.title = "Sit Up "
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tralala: Button = findViewById(R.id.btnStopwatch)
        tralala.setOnClickListener() {
            val intent = Intent(this, MainActivitySitupStopwatch::class.java)
            startActivity(intent)
        }
        val tralala2: Button = findViewById(R.id.btnTimer)
        tralala2.setOnClickListener() {
            val intent = Intent(this, MainActivitySitupTimer::class.java)
            startActivity(intent)
        }
    }
}
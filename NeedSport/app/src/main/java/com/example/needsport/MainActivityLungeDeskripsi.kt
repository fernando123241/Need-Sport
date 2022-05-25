package com.example.needsport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityLungeDeskripsi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lunge_deskripsi)

        val actionBar = supportActionBar
        actionBar!!.title = "Lunge "
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tralala: Button = findViewById(R.id.btnStopwatch)
        tralala.setOnClickListener() {
            val intent = Intent(this, MainActivityLungeStopwatch::class.java)
            startActivity(intent)
        }
        val tralala2: Button = findViewById(R.id.btnTimer)
        tralala2.setOnClickListener() {
            val intent = Intent(this, MainActivityLungeTimer::class.java)
            startActivity(intent)
        }
    }
}
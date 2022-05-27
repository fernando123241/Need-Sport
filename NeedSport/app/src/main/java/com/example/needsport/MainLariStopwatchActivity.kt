package com.example.needsport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class MainLariStopwatchActivity : AppCompatActivity() {

    var pauseAt : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lari_stopwatch)

        val actionBar = supportActionBar
        actionBar!!.title = "Stopwatch - Lari"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val bajingan: Button = findViewById(R.id.btnDeskripsi)
        bajingan.setOnClickListener() {
            val intent = Intent(this, MainActivityLungeDeskripsi::class.java)
            startActivity(intent)
        }
        val bajingan2: Button = findViewById(R.id.btnTimer)
        bajingan2.setOnClickListener() {
            val intent = Intent(this, MainLariTimerActivity::class.java)
            startActivity(intent)
        }
        val btnStart : Button = findViewById(R.id.btnstart)
        val btnReset : Button = findViewById(R.id.btnreset)
        val btnPause : Button = findViewById(R.id.btnpause)
        val chrono : Chronometer = findViewById(R.id.stopwatch)

        btnStart.setOnClickListener(){
            chrono.base = SystemClock.elapsedRealtime()-pauseAt
            chrono.start()
        }
        btnPause.setOnClickListener(){
            pauseAt = SystemClock.elapsedRealtime()-chrono.base
            chrono.stop()
        }
        btnReset.setOnClickListener(){
            chrono.base= SystemClock.elapsedRealtime()
        }
    }
}
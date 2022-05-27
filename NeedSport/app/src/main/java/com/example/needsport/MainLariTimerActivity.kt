package com.example.needsport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainLariTimerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lari_timer)

        val actionBar = supportActionBar
        actionBar!!.title = "Timer - Lari "
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tujuan: Button = findViewById(R.id.btnDeskripsi)
        tujuan.setOnClickListener() {
            val intent = Intent(this, MainLariDeskripsiActivity::class.java)
            startActivity(intent)
        }
        val tujuan2: Button = findViewById(R.id.btnStopwatch)
        tujuan2.setOnClickListener() {
            val intent = Intent(this, MainLariStopwatchActivity::class.java)
            startActivity(intent)
        }

        val timerbtn : Button = findViewById(R.id.timerBtn)
        val teksViewCikti : TextView = findViewById(R.id.textViewCikti)
        timerbtn.setOnClickListener {
            val sayici = object : CountDownTimer(30000, 1000) {

                override fun onTick(i: Long) {
                    teksViewCikti.text = "Sisa Waktu : ${i / 1000} detik"
                }

                override fun onFinish() {
                    teksViewCikti.text = "Selesai !!"
                }
            }
            sayici.start()

        }
    }
}
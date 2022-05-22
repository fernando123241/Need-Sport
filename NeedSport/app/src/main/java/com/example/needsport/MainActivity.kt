package com.example.needsport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupWindow
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val callCenterBtn: Button = findViewById (R.id.btn_callCenter)
        val masukBtn: Button = findViewById(R.id.btn_masuk)

        callCenterBtn.setOnClickListener() {
            val intent = Intent(this, CallCenter::class.java)
            startActivity(intent)
        }
        masukBtn.setOnClickListener() {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

    }
}
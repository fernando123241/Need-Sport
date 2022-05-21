package com.example.needsport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CallCenter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_center)

        val actionBar = supportActionBar

        actionBar!!.title = "Call Center - Need Sport"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}
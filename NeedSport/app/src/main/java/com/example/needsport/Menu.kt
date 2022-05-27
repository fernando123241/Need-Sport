package com.example.needsport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val actionBar = supportActionBar
        actionBar!!.title = "Menu - Need Sport"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val exclamationButton : ImageView = findViewById(R.id.exclamationBtn)
        exclamationButton.setOnClickListener {

            val view = View.inflate(this, R.layout.layout_popup, null)

            val builder = AlertDialog.Builder(this)

            builder.setView(view)

            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        }

        val pushUpBtn: ImageView = findViewById(R.id.push_up)
        pushUpBtn.setOnClickListener() {
            val intent = Intent(this, MainActivityPushupDeskripsi::class.java)
            startActivity(intent)
        }
        val sitUpBtn: ImageView = findViewById(R.id.sit_up)
        sitUpBtn.setOnClickListener() {
            val intent = Intent(this, MainActivitySitupDeskripsi::class.java)
            startActivity(intent)
        }
        val lungeBtn: ImageView = findViewById(R.id.lunge)
        lungeBtn.setOnClickListener() {
            val intent = Intent(this, MainActivityLungeDeskripsi::class.java)
            startActivity(intent)
        }
        val plankBtn: ImageView = findViewById(R.id.plank)
        plankBtn.setOnClickListener() {
            val intent = Intent(this, MainActivityPlankDeskripsi::class.java)
            startActivity(intent)
        }
        val lariBtn: ImageView = findViewById(R.id.lari)
        lariBtn.setOnClickListener() {
            val intent = Intent(this, MainLariDeskripsiActivity::class.java)
            startActivity(intent)
        }
    }
}
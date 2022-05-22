package com.example.needsport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
    }
}
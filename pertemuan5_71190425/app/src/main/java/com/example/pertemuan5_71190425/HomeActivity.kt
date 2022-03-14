package com.example.pertemuan5_71190425

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = getIntent().getStringExtra("username")
        val password = getIntent().getStringExtra("password")

        val home = findViewById<TextView>(R.id.home)
        home.text = "Selamat Datang $username !!!"
    }
}
package com.example.pertemuan5_71190425

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.editTextUsername)
        val password = findViewById<EditText>(R.id.editTextPassword)
        val btnLogin = findViewById<Button>(R.id.button5)

        btnLogin.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()
            if (pass == "12345") {
                val p = Intent(this, HomeActivity::class.java)
                p.putExtra("username", user.toString())
                p.putExtra("password", pass.toString())
                startActivity(p)
            } else {
                Toast.makeText(
                    this,
                    "Password SALAH!!!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }}
package com.example.keqing

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

            val btn = findViewById<Button>(R.id.buttonMain)
            btn.setOnClickListener{
                val intent = Intent(this,Main::class.java)
                startActivity(intent)
            }

       val btnProf = findViewById<Button>(R.id. buttonProfil)
        btnProf.setOnClickListener{
            val intent = Intent(this,Profil::class.java)
            startActivity(intent)
        }
        }
    }

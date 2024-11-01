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

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding)

            val btn = findViewById<Button>(R.id.button_one)
            btn.setOnClickListener{
            val intent = Intent(this,Login::class.java)
                startActivity(intent)
        }
        }

    }

package com.example.gasosacalculadora

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 1. Passar para a próxima tela; e
        // 2. intent.putExtras na Main (consertar senha).

        val btniniciar = findViewById<Button>(R.id.btn_iniciar)

        btniniciar.setOnClickListener {

            val intent = Intent(this, PriceActivity:: class.java)
            startActivity(intent)

            println("Geo ação do botão ")
        }

        }
    }
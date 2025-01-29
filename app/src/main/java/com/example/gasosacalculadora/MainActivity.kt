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
        
        // 1. Adicionar imagens;
        // 2. Consertar espaços de texto;
        // 3. Adicionar background em telas;
        // 4. Corrigir cor no StatusBar;
        // 5. Arredondar cantos dos edts; e
        // 6. Adicionar ids.

        val btniniciar = findViewById<Button>(R.id.btn_iniciar)

        btniniciar.setOnClickListener {

            val intent = Intent(this, PriceActivity:: class.java)
            startActivity(intent)
        }

        }
    }
package com.example.gasosacalculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val RESULT_KEY_GC = "ResultActivity.key_gc"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val price = intent.getFloatExtra(KEY_PRICE_GC, 0f)
        val consumo = intent.getFloatExtra(KEY_CONSUMO_GC, 0f)
        val distancia = intent.getFloatExtra(KEY_DISTANCIA_GC, 0f)

        val buttonResult = findViewById<Button>(R.id.btn_result)
        val tvresult = findViewById<TextView>(R.id.tv_result)

    }
}
package com.example.gasosacalculadora

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

const val RESULT_KEY_GC = "ResultActivity.key_gc"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val price = intent.getFloatExtra(KEY_PRICE_GC, 0f)
        val consumo = intent.getFloatExtra(KEY_CONSUMO_GC, 0f)
        val distancia = intent.getFloatExtra(KEY_DISTANCIA_GC, 0f)

        val priceresult = findViewById<TextView>(R.id.tv_priceresult)
        val consumoresult = findViewById<TextView>(R.id.tv_consumoresult)
        val distanciaresult = findViewById<TextView>(R.id.tv_distanciaresult)
        val buttonResult = findViewById<Button>(R.id.btn_result)
        val tvresult = findViewById<TextView>(R.id.tv_result)

        priceresult.text.toString()
        consumoresult.text.toString()
        distanciaresult.text.toString()

        val calcTotal = if (consumo != 0f) {
            (distancia / consumo) * price

        } else {
            0f
        }
        tvresult.text = "R$ %.2f".format(calcTotal)

        buttonResult.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
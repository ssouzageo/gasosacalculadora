package com.example.gasosacalculadora

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_PRICE_GC = "PriceActivity.Key_GC"

class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_price)

        val price = intent.getFloatExtra(KEY_PRICE_GC, 0f)

        val btnprice = findViewById<Button>(R.id.btn_price)

        btnprice.setOnClickListener {

            println("Geo ação de botão " + price)

        }

    }
}
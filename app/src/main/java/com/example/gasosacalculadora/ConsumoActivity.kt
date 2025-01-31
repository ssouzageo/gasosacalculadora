package com.example.gasosacalculadora

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_CONSUMO_GC = "ConsumoActivity.Key_GC"

class ConsumoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo)

        val price = intent.getFloatExtra(KEY_PRICE_GC, 0f)

        val edtconsumo = findViewById<TextInputEditText>(R.id.edt_consumo)
        val buttonConsumo = findViewById<Button>(R.id.btn_consumo)

        buttonConsumo.setOnClickListener {

            val consumoStr: String = edtconsumo.text.toString()

            if (edtconsumo.text.toString() == "" ) {
                Snackbar
                    .make(
                        it,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val consumo = edtconsumo.text.toString().toFloatOrNull() ?: 0.0

                val intent = Intent(this, DistanciaActivity::class.java)
                intent.putExtra(KEY_CONSUMO_GC, consumo)
                intent.putExtra("PriceActivity.Key_GC", price)
                startActivity(intent)
            }
        }
    }

}


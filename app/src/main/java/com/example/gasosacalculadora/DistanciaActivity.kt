package com.example.gasosacalculadora

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_DISTANCIA_GC = "KeyActivity.key_GC"

class DistanciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distancia)

        val consumo = intent.getFloatExtra(KEY_CONSUMO_GC, 0f)

        val buttonDistancia = findViewById<Button>(R.id.btn_distancia)
        val edtdistancia = findViewById<TextInputEditText>(R.id.edt_distancia)

        buttonDistancia.setOnClickListener {
            if (edtdistancia.text.toString() == "") {
                Snackbar
                    .make(
                        it,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val distancia = edtdistancia.text.toString().toFloatOrNull() ?: 0.0

                intent.putExtra(KEY_DISTANCIA_GC, distancia)
                intent.putExtra("PriceActivity.Key_GC", price)
                intent.putExtra("ConsumoActivity.Key_GC", consumo)
                startActivity(intent)

            }

        }

    }
}
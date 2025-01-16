package com.example.gasosacalculadora

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_PREÇO_GC = "PreçoActivity.Key_GC"

class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_price)

        val price = intent.getFloatExtra(KEY_PREÇO_GC, 0f)

        val edtPreço = findViewById<TextInputEditText>(R.id.edt_preço)
        val btnPreço = findViewById<Button>(R.id.btn_preço)

        btnPreço.setOnClickListener {

            val preçoStr: String = edtPreço.text.toString()

            if (preçoStr == "") {
                    Snackbar
                        .make(
                            edtPreço,
                            "Preencha todos os campos.",
                            Snackbar.LENGTH_LONG
                        )
                        .show()
                } else {
                    val preço = preçoStr.toFloat()
                }

                println("Geo ação de botão " + price)
            }

        }
    }
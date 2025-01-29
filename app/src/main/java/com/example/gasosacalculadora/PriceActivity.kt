package com.example.gasosacalculadora

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

const val KEY_PRICE_GC = "PriceActivity.Key_GC"

class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_price)

        val edtprice = findViewById<TextInputEditText>(R.id.edt_price)
        val buttonPrice = findViewById<Button>(R.id.btn_price)

        buttonPrice.setOnClickListener {

            val priceStr: String = edtprice.text.toString()

            if (edtprice.text.toString() == "" ) {
                Snackbar
                    .make(
                        it,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val price = edtprice.text.toString().toFloatOrNull() ?: 0.0

                intent.putExtra(KEY_PRICE_GC, price)
                startActivity(intent)

                }
            }
        }
    }


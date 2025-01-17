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

const val KEY_PREÇO_GC = "PreçoActivity.Key_GC"

class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_price)

        val preço = intent.getFloatExtra(KEY_PREÇO_GC, 0f)

        val edtpreço = findViewById<TextInputEditText>(R.id.edt_preço)
        val buttonPreço = findViewById<Button>(R.id.btn_preço)

        buttonPreço.setOnClickListener {
            if (edtpreço.text.toString() == "" ) {
                Snackbar
                    .make(
                        it,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val price = edtpreço.text.toString().toFloatOrNull() ?: 0.0


                intent.putExtra(KEY_PREÇO_GC, price)
                startActivity(intent)
            }
        }
    }

            }

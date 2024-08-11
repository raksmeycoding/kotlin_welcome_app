package com.raksmey.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var editText: EditText? = null
    private var myBtn: Button? = null
    private var title: TextView? = null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edit_text_id)
        title = findViewById(R.id.titleTextView)
        val buttonClickHereId: Button = findViewById(R.id.click_here_id_btn)



        buttonClickHereId.setOnClickListener { _ ->
            val inputName = editText?.text
            Toast.makeText(this, "Welcome $inputName to our App", Toast.LENGTH_LONG).show()
        }

    }
}
package com.swai.role

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addNumber: Button = findViewById(R.id.btn_add)
        val minusNumber : Button = findViewById(R.id.btn_minus)

        addNumber.setOnClickListener {
            increase()
        }
        minusNumber.setOnClickListener {
            decrease()
        }
    }

    private fun increase() {
        count++
        val resultText: TextView = findViewById(R.id.display_number)
        resultText.text = count.toString()
    }

    private fun decrease(){
        count--
        val results: TextView =  findViewById(R.id.display_number)
        results.text = count.toString()
    }

}
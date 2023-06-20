package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId) {
                R.id.radio_button1 -> {
                    Toast.makeText(this@MainActivity, "Checkbox 1 is checked", Toast.LENGTH_SHORT).show()
                }
                R.id.radio_button2 -> {
                    Toast.makeText(this@MainActivity, "Checkbox 2 is checked", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
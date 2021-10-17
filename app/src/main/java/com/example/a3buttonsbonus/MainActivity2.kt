package com.example.a3buttonsbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tvv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvv = findViewById(R.id.textView2)
        tvv.text = intent.getStringExtra("aa")
    }
}
package com.example.a3buttonsbonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var et1:EditText
    lateinit var et2:EditText
    lateinit var et3:EditText
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView)

        et1 = findViewById(R.id.editTextTextPersonName)
        et2 = findViewById(R.id.editTextTextPersonName2)
        et3 = findViewById(R.id.editTextTextPersonName3)

        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button5)


        btn1.setOnClickListener {
            val aa = "${et1.text.toString()} ${et2.text.toString()} ${et3.text.toString()}"
            Toast.makeText(this,"$aa",Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {
            val aa = "${et1.text.toString()} ${et2.text.toString()} ${et3.text.toString()}"
             tv.text = aa
        }

        btn3.setOnClickListener {
            val aa = "${et1.text.toString()} ${et2.text.toString()} ${et3.text.toString()}"
           val intent = Intent(this,MainActivity2::class.java)
               .putExtra("aa","$aa")
            startActivity(intent)
        }

    }
}
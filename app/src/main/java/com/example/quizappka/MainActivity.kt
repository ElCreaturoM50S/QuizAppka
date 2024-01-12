package com.example.quizappka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.edittext_name)
        val readyButton: Button = findViewById(R.id.button_start)

        readyButton.setOnClickListener {
            if (editText.text.isEmpty()){
                Toast.makeText(this,"Miliony muszą wpisywać swoje imię...",Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this,QuizPage::class.java)
                intent.putExtra("nazwagracza", editText.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}
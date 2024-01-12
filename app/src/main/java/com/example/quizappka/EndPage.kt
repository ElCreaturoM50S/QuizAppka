package com.example.quizappka

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EndPage: AppCompatActivity() {
    private var nazwaGraczaStr: String? = null
    private var wynikGraczaStr: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val intentBundle = intent.getBundleExtra("wynikgracza")!!

        nazwaGraczaStr = intentBundle.getString("nazwagracza")
        wynikGraczaStr = intentBundle.getString("wynik")
        Log.i("Jarvis", "$wynikGraczaStr")
        Log.i("Jarvis", "$nazwaGraczaStr")
        val powrot: Button = findViewById(R.id.button_return)
        val nazwaView: TextView = findViewById(R.id.nazwaGracza)
        val wynikView: TextView = findViewById(R.id.wynikGracza)

        nazwaView.text = nazwaGraczaStr
        wynikView.text = wynikGraczaStr
        powrot.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
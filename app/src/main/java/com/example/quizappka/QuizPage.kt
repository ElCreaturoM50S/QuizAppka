package com.example.quizappka

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class QuizPage : AppCompatActivity() {

    var nazwagracza: String? = null

    var progbar: ProgressBar? = null
    var progtextview: TextView? = null
    var progpytanie: TextView? = null
    var imageimageimage: ImageView? = null

    var answearOne: TextView? = null
    var answearTwo: TextView? = null
    var answearThree: TextView? = null
    var answearFour: TextView? = null

    var pytaniaArray: ArrayList<PytaniaKlasa>? = null
    var aktualnePytanie: Int = 0
    var poprawneOdpowiedzi: Int = 0
    var wybranaOdpowiedz: Int? = null

    var buttonSubmit: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        nazwagracza = intent.getStringExtra("nazwagracza")
        Log.i("Jarvis", "$nazwagracza")

        progbar = findViewById(R.id.progressbar_question)
        progtextview = findViewById(R.id.textview_progress)
        progpytanie = findViewById(R.id.textview_pytanie)
        imageimageimage = findViewById(R.id.imageview_album)

        answearOne = findViewById(R.id.textview_answerone)
        answearTwo = findViewById(R.id.textview_answertwo)
        answearThree = findViewById(R.id.textview_answerthree)
        answearFour = findViewById(R.id.textview_answerfour)

        buttonSubmit = findViewById(R.id.button_submit)

        answearOne?.setOnClickListener {
            wybranaOdpowiedzFun(answearOne!!, 0)
        }

        answearTwo?.setOnClickListener {
            wybranaOdpowiedzFun(answearTwo!!, 1)
        }

        answearThree?.setOnClickListener {
            wybranaOdpowiedzFun(answearThree!!, 2)
        }

        answearFour?.setOnClickListener {
            wybranaOdpowiedzFun(answearFour!!, 3)
        }

        buttonSubmit?.setOnClickListener {
            dalej()
        }

        pytaniaArray = PytaniaLista.dawajPytania()
        pytaniaArray!!.shuffle()

        nowePytanie()
    }

    @SuppressLint("SetTextI18n")
    fun nowaKarta() {
        buttonSubmit!!.text = "Wybierz odpowiedź!"

        val odpowiedzidopytania = ArrayList<TextView>()

        answearOne?.let {
            odpowiedzidopytania.add(0,it)
        }

        answearTwo?.let {
            odpowiedzidopytania.add(0,it)
        }

        answearThree?.let {
            odpowiedzidopytania.add(0,it)
        }

        answearFour?.let {
            odpowiedzidopytania.add(0,it)
        }

        for (odpowiedzview in odpowiedzidopytania){
            odpowiedzview.setTextColor(Color.parseColor("#000000"))
            odpowiedzview.typeface = Typeface.DEFAULT
        }
    }

    fun wybranaOdpowiedzFun(answearTextView: TextView, wybranaOdpowiedzNumer: Int) {
        nowaKarta()
        wybranaOdpowiedz = wybranaOdpowiedzNumer
        answearTextView.setTextColor(Color.parseColor("#00AA00"))
    }

    @SuppressLint("SetTextI18n")
    fun nowePytanie() {
        val pytanie: PytaniaKlasa = pytaniaArray!![aktualnePytanie]
        Log.i("Jarvis", "$pytaniaArray!![aktualnePytanie]")

        imageimageimage!!.setImageResource(pytanie.image)

        progbar!!.progress = aktualnePytanie
        Log.i("Jarvis", "$aktualnePytanie")

        progtextview!!.text = "${aktualnePytanie}/${progbar?.max}"

        progpytanie!!.text = pytanie.questions

        answearOne!!.text = pytanie.answerOne
        answearTwo!!.text = pytanie.answerTwo
        answearThree!!.text = pytanie.answerThree
        answearFour!!.text = pytanie.answerFour

    }

    fun dalej() {
        if (wybranaOdpowiedz == null) {
            return
        }
        if (pytaniaArray!![aktualnePytanie].correctAnswer == wybranaOdpowiedz) {
            poprawneOdpowiedzi++
        }
        aktualnePytanie++
        if (aktualnePytanie == progbar?.max!!) {
            val extras = Bundle()
            extras.putSerializable("nazwagracza", nazwagracza)
            extras.putSerializable("wynik", "${poprawneOdpowiedzi}/${progbar?.max}")

            val intent = Intent(this, EndPage::class.java)
            intent.putExtra("wynikgracza", extras)
            startActivity(intent)
            finish()
            return
        }

        wybranaOdpowiedz = null
        nowePytanie()
        nowaKarta()
    }
}
package com.example.quizappka

object PytaniaLista {
    fun dawajPytania(): ArrayList<PytaniaKlasa>{
        val lista = ArrayList<PytaniaKlasa>()

        val Pytanie1 = PytaniaKlasa(
            id = 1,
            questions = "Co to za okładka albumu",
            image = R.drawable.athousandsuns,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        val Pytanie2 = PytaniaKlasa(
            id = 2,
            questions = "Co to za okładka albumu",
            image = R.drawable.collisioncourse,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        val Pytanie3 = PytaniaKlasa(
            id = 2,
            questions = "Co to za okładka albumu",
            image = R.drawable.hybridtheory,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        val Pytanie4 = PytaniaKlasa(
            id = 2,
            questions = "Co to za okładka albumu",
            image = R.drawable.livingthings,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        val Pytanie5 = PytaniaKlasa(
            id = 2,
            questions = "Co to za okładka albumu",
            image = R.drawable.meteora,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        val Pytanie6 = PytaniaKlasa(
            id = 2,
            questions = "Co to za okładka albumu",
            image = R.drawable.m2m,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        val Pytanie7 = PytaniaKlasa(
            id = 2,
            questions = "Co to za okładka albumu",
            image = R.drawable.oml,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        val Pytanie8 = PytaniaKlasa(
            id = 2,
            questions = "Co to za okładka albumu",
            image = R.drawable.reanimation,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        val Pytanie9 = PytaniaKlasa(
            id = 2,
            questions = "Co to za okładka albumu",
            image = R.drawable.recharged,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        val Pytanie10 = PytaniaKlasa(
            id = 2,
            questions = "Co to za okładka albumu",
            image = R.drawable.thehuntingparty,
            answerOne = "A Thousand Suns",
            answerTwo = "A Two Suns",
            answerThree = "Overcharged",
            answerFour = "Black'n'White",
            correctAnswer = 0
        )

        lista.add(Pytanie1)
        lista.add(Pytanie2)
        lista.add(Pytanie3)
        lista.add(Pytanie4)
        lista.add(Pytanie5)
        lista.add(Pytanie6)
        lista.add(Pytanie7)
        lista.add(Pytanie8)
        lista.add(Pytanie9)
        lista.add(Pytanie10)

        return lista
    }
}
package com.example.quizappka

data class PytaniaKlasa(
    val id: Int,
    val questions: String,
    val image: Int,
    val answerOne: String,
    val answerTwo: String,
    val answerThree: String,
    val answerFour: String,
    val correctAnswer: Int
)


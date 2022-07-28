package com.tutorials.myquizapp

enum class QuizType{
    IMAGE,
    QUIZ
}

data class Question(
    val id: Int,
    val type: QuizType,
    val question: String,
    val Image: Int,
    var options: List<String>?,
    val correctAnswer: String
)

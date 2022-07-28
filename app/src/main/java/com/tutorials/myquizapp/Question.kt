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
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: String
)

package com.tutorials.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Australia",
            optionThree = "Armenia",
            optionFour = "Austria",
            correctAnswer = 1
        )
        questionList.add(que1)

        val que2 = Question(
            id = 2,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_brazil,
            optionOne = "Argentina",
            optionTwo = "Congo",
            optionThree = "Brazil",
            optionFour = "Mongolia",
            correctAnswer = 3
        )
        questionList.add(que2)

        val que3 = Question(
            id = 3,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_india,
            optionOne = "Pakistan",
            optionTwo = "Nepal",
            optionThree = "India",
            optionFour = "Mongolia",
            correctAnswer = 3
        )
        questionList.add(que3)

        val que4 = Question(
            id = 4,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_israel,
            optionOne = "Israel",
            optionTwo = "Iran",
            optionThree = "India",
            optionFour = "Vatican City",
            correctAnswer = 1
        )
        questionList.add(que4)

        val que5 = Question(
            id = 5,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_mongolia,
            optionOne = "China",
            optionTwo = "Mongolia",
            optionThree = "India",
            optionFour = "Uzbekistan",
            correctAnswer = 2
        )
        questionList.add(que5)

        val que6 = Question(
            id = 6,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_new_zealand,
            optionOne = "United Kingdom",
            optionTwo = "Australia",
            optionThree = "New Zealand",
            optionFour = "Canada",
            correctAnswer = 3
        )
        questionList.add(que6)

        val que7 = Question(
            id = 7,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_south_africa,
            optionOne = "Syria",
            optionTwo = "ghana",
            optionThree = "Egypt",
            optionFour = "South Africa",
            correctAnswer = 3
        )
        questionList.add(que7)

        return questionList
    }
}
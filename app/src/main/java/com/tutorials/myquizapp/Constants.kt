package com.tutorials.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            id = 1,
            type = QuizType.IMAGE,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Australia",
            optionThree = "Armenia",
            optionFour = "Austria",
            correctAnswer = "Argentina"
        )
        questionList.add(que1)

        val que2 = Question(
            id = 2,
            type = QuizType.IMAGE,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_brazil,
            optionOne = "Argentina",
            optionTwo = "Congo",
            optionThree = "Brazil",
            optionFour = "Mongolia",
            correctAnswer = "Brazil"
        )
        questionList.add(que2)

        val que3 = Question(
            id = 3,
            type = QuizType.IMAGE,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_india,
            optionOne = "Pakistan",
            optionTwo = "Nepal",
            optionThree = "India",
            optionFour = "Mongolia",
            correctAnswer = "India"
        )
        questionList.add(que3)

        val que4 = Question(
            id = 4,
            type = QuizType.IMAGE,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_israel,
            optionOne = "Israel",
            optionTwo = "Iran",
            optionThree = "India",
            optionFour = "Vatican City",
            correctAnswer = "Israel"
        )
        questionList.add(que4)

        val que5 = Question(
            id = 5,
            type = QuizType.IMAGE,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_mongolia,
            optionOne = "China",
            optionTwo = "Mongolia",
            optionThree = "India",
            optionFour = "Uzbekistan",
            correctAnswer = "Mongolia"
        )
        questionList.add(que5)

        val que6 = Question(
            id = 6,
            type = QuizType.IMAGE,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_new_zealand,
            optionOne = "United Kingdom",
            optionTwo = "Australia",
            optionThree = "New Zealand",
            optionFour = "Canada",
            correctAnswer = "New Zealand"
        )
        questionList.add(que6)

        val que7 = Question(
            id = 7,
            type = QuizType.IMAGE,
            question = "What country does this flag belong to?",
            Image = R.drawable.flag_of_south_africa,
            optionOne = "Syria",
            optionTwo = "ghana",
            optionThree = "Egypt",
            optionFour = "South Africa",
            correctAnswer = "Egypt"
        )
        questionList.add(que7)

        val que8 = Question(
            id = 8,
            type = QuizType.QUIZ,
            question = "'그는 국회의원이 되어 금( )를 달았다'에서 ( )는?",
            Image = 0,
            optionOne = "배찌",
            optionTwo = "배지",
            optionThree = "뱃지",
            optionFour = "뱃찌",
            correctAnswer = "배지"
        )
        questionList.add(que8)

        val que9 = Question(
            id = 9,
            type = QuizType.QUIZ,
            question = "만화영화 <톰과 제리>가 우리나라에서 처음 방송될 때 제목은?",
            Image = 0,
            optionOne = "생쥐와 고양이",
            optionTwo = "깐돌이와 야옹이",
            optionThree = "미련한 고양이와 꾀돌이 쥐",
            optionFour = "바보 고양이와 꾀쟁이 쥐",
            correctAnswer = "깐돌이와 야옹이"
        )
        questionList.add(que9)

        val que10 = Question(
            id = 10,
            type = QuizType.QUIZ,
            question = "<사자성어>의 <사>와 다른 한자는?",
            Image = 0,
            optionOne = "사고무친",
            optionTwo = "사면초가",
            optionThree = "사각지대",
            optionFour = "사자대면",
            correctAnswer = "사각지대"
        )
        questionList.add(que10)

        val que11 = Question(
            id = 11,
            type = QuizType.QUIZ,
            question = "속담 <불 없는 화로, ( ) 없는 사위>에서 ( )은?",
            Image = 0,
            optionOne = "눈치",
            optionTwo = "싸가지",
            optionThree = "딸",
            optionFour = "돈",
            correctAnswer = "딸"
        )
        questionList.add(que11)

        val que12 = Question(
            id = 12,
            type = QuizType.IMAGE,
            question = "입체파인 선구자 파블로 피카소가 민간인 학살을 통해 전쟁의 참살을 고발한 작품이다. 같은 배경을 가진 것은?",
            Image = R.drawable.massacre_in_korea_pablo_picasso,
            optionOne = "영화<태극기 휘날리며>",
            optionTwo = "영화<라이언 일병 구하기>",
            optionThree = "뮤지컬<미스 사이공>",
            optionFour = "영화<덩케르크>",
            correctAnswer = "영화<태극기 휘날리며>"
        )
        questionList.add(que12)

        return questionList
    }
}
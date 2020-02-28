package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class QuizActivity : AppCompatActivity() {

    var questions = arrayOf("Is the Amazon the biggest rain forest in the word?", "Roughly how big is the amazon?", "Does teh Amazon have the largest river?", "What mountain range influences the flow of the amazon river?", "In what country is most of the Amazons forest located in?")
    lateinit var right_answer: TextView
    lateinit var question_textView: TextView
    lateinit var user_answer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        right_answer = findViewById(R.id.right_answer)
        question_textView = findViewById(R.id.question_textview)
        user_answer = findViewById(R.id.user_answer)

    }
    fun startQuiz(){

    }


    fun showAnswer(view:View) {

    }
    fun checkAnswer(view: View){

    }
    fun changeQuestion(view :View){

    }
    fun rightAnswer(){

    }
    fun wrongAnswer(){

    }
}

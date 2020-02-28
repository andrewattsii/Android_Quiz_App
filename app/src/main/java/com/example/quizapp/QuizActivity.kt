package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class QuizActivity : AppCompatActivity() {

    var questions = arrayOf("Animone", "Rose", "Broom", "Dahlia", "Catmint", "Cosmos")
    lateinit var right_answer: TextView
    lateinit var question_textView: TextView
    lateinit var user_answer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        right_answer = findViewById(R.id.right_answer)
        question_textView = findViewById(R.id.question_textview)
        user_answer = findViewById(R.id.user_answer)
        question_textView.text = mixLetters("word")

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


    fun mixLetters(word: String): String{
        val characters = word.toCharArray()
        for (i in characters.indices) {
            val randomIndex = (Math.random() * characters.size).toInt()
            val temp = characters[i]
            characters[i] = characters[randomIndex]
            characters[randomIndex] = temp
        }
        return String(characters)
    }
}

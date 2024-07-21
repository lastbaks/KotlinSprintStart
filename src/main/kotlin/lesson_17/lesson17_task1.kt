package org.example.lesson_17

class Question {
    var question: String = "Расстояние от земли до солнца"
        get() = field

    var answer: String = "Сто сорок девять миллионов километров"
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val question1 = Question()
    println(question1.question)
    println(question1.answer)
}

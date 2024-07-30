package org.example.lesson_20

import kotlin.random.Random

//
class Robot {
    private var modifier: ((String) -> String)? = null
    private val phrases = listOf(
        "пора вставать",
        "включаю музыку",
        "спокойной ночи",
        "вам пришло новое сообщение",
        "вы хотели купить подарок",
    )

    fun say() {
        val phrase = phrases[Random.nextInt(phrases.size)]
        val modifiedPhrase = modifier?.invoke(phrase) ?: phrase
        println(modifiedPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }
    robot.say()
}
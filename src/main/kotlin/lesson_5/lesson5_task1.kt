package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val termOne = Random.nextInt(from = 2, until = 10)
    val termTwo = Random.nextInt(from = 3, until = 10)
    println("Введите сумму чисел $termOne и $termTwo")
    val answer = readln().toInt()
    val message = if (answer == termOne + termTwo) {
        "Добро пожаловать"
    } else {
        "Доступ запрещен"
    }
    println(message)

}
package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val firstNumber: Int = Random.nextInt(from = 0, until = 42)
    val secondNumber: Int = Random.nextInt(from = 0, until = 42)
    val firstAnswer: Int
    val secondAnswer: Int
    var points = 0

    println("Я загадал два числа, попробуй отгадай")
    println("Введи первое число")
    firstAnswer = readln().toInt()
    if ((firstAnswer == firstNumber) || (firstAnswer == secondNumber)) {
        println("Поздравляю, ты угадал одно из чисел")
        points += 1
    } else {
        println("К сожалению первое число ты не угадал")
    }
    println("Введи второе число")
    secondAnswer = readln().toInt()
    if (((secondAnswer == secondNumber) || (secondAnswer == firstNumber)) && (secondAnswer != firstAnswer)) {
        println("Поздравляю, ты угадал второе число")
        points += 1
    } else {
        println("Второе число ты не угадал")
    }
    println("Я загадал числа $firstNumber и $secondNumber")
    when(points) {
        0 -> println("К сожалению ты не угадал ни одного числа")
        1 -> println("Ты угадал одно из чисел, поздравляю! Ты выиграл утешительный приз")
        2 -> println("Ты угадал оба числа, поздраврялю! Ты выиграл главный приз")
    }
}
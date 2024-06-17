package org.example.lesson_5

import kotlin.random.Random

fun main() {
    var numbers = mutableListOf<Int>()
    var answers = mutableListOf<Int>()
    val points: Set<Int>
    var number: Int
    while (numbers.size < 3) {
        number = (Random.nextInt(from = 0, until = 42))
        if (numbers.contains(number)) {
            continue
        }
        numbers.add(number)
    }

    println("Робот загадал три числа. Попробуйте их отгадать")
    println("Введите первое число")
    answers.add(readln().toInt())
    println("Введите второе число")
    answers.add(readln().toInt())
    println("Введите третье число")
    answers.add(readln().toInt())
    println(answers)

    points = numbers.intersect(answers.toSet())

    when (points.size) {
        0 -> println("Вы не угадали ни одного числа")
        1 -> println("Вы угадали одно число и получаете утешительный приз")
        2 -> println("Вы угадали два числа и получаете крупный приз")
        3 -> println("Вы угадали все числа и выиграли джекпот")
    }
    println("Вот список загаданных чисел: $numbers")
}
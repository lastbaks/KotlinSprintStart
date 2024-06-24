package org.example.lesson_6

import kotlin.random.Random

fun main() {
    val number: Int = Random.nextInt(from = 1, until = 10)
    var answer: Int
    var counter: Int = 5
    println("Я загадал число от 1 до 9 . Угадай. У тебя 5 попыток")
    while (counter > 0)  {
        answer = readln().toInt()
        if(answer == number) {
            println("Ты угадал число! Это была великолепная игра!")
            break
        } else {
            counter--
            println("Ошибка. Осталось $counter попыток")
        }
        println("Было загадано число $number")
    }
}
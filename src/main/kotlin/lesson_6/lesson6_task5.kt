package org.example.lesson_6

import kotlin.random.Random

fun main() {
    var valueOne: Int
    var valueTwo: Int
    var answer: Int
    var counter = 3

    while (counter > 0){
        println("Для проверки, что вы не бот - решите математическую задачу:")
        valueOne = Random.nextInt(from = 1, until = 10)
        valueTwo = Random.nextInt(from = 1, until = 10)
        println("$valueOne + $valueTwo = ")
        answer = readln().toInt()
        if(answer == valueOne + valueTwo) {
            println("Добро пожаловать")
            return
        } else {
            println("Неверно, осталось ${--counter} попыток")
        }
    }
    println("Доступ запрещен")
}
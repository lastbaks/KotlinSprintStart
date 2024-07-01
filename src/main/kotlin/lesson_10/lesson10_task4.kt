package org.example.lesson_10

import kotlin.random.Random

const val MINIMAL_VALUE = 1
const val MAXIMUN_VALUE = 7

fun main() {

    println("Добро пожаловать в игру \"Кости\"")
    val countOfWins = round()
    println("Игра закончена. Вы победили в $countOfWins раундах")
}

fun round(): Int {
    var humanResult: Int
    var machineResult: Int
    var ready = true
    var humanWinCount = 0
    while (ready) {
        println("Ваш ход")
        humanResult = getRandomValue()
        println("Сумма на ваших кубиках = $humanResult")
        machineResult = getRandomValue()
        println("Сумма на кубиках машины = $machineResult")

        if(humanResult > machineResult) {
            println("Победило человечество")
            humanWinCount += 1
        } else if (machineResult > humanResult) {
            println("Победили машины")
        } else {
            println("Ничья. человечество и машины ушли зализывать раны и готовиться к новому сражению")
        }
        println("Желаете сыграть еще раз?")
        when (readln()) {
            "да" -> ready = true
            "нет" -> ready = false
            else -> {
                println( "вы ответили что то невразумительное, видимо вы в азарте боя. Игра начинается снова!")

            }
        }
    }
    return humanWinCount
}

fun getRandomValue(): Int {
    val firstDice = Random.nextInt(from = MINIMAL_VALUE, until = MAXIMUN_VALUE)
    val secondDice = Random.nextInt(from = MINIMAL_VALUE, until = MAXIMUN_VALUE)
    return firstDice + secondDice
}

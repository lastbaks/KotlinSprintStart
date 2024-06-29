package org.example.lesson_10

import kotlin.random.Random

const val MINIMAL_VALUE = 1
const val MAXIMUN_VALUE = 7
var countOfHumanWins = 0
var readyToGame = true

fun main() {

    println("Добро пожаловать в игру \"Кости\"")
    while (readyToGame) {
        round()
    }
    println("Игра закончена. Вы победили в $countOfHumanWins раундах")
}

fun round() {
    val humanResult: Int
    val machineResult: Int

    println("Ваш ход")
    humanResult = getRandomValue()
    println("Сумма на ваших кубиках = $humanResult")
    machineResult = getRandomValue()
    println("Сумма на кубиках машины = $machineResult")

    if(humanResult > machineResult) {
        println("Победило человечество")
        countOfHumanWins += 1
    } else if (machineResult > humanResult) {
        println("Победили машины")
    } else {
        println("Ничья. человечество и машины ушли зализывать раны и готовиться к новому сражению")
    }
    println("Желаете сыграть еще раз?")
    when (readln()) {
        "да" -> readyToGame = true
        "нет" -> readyToGame = false
        else -> {
           println( "вы ответили что то невразумительное, видимо вы в азарте боя. Игра начинается снова!")

        }
    }
}

fun getRandomValue(): Int {
    val firstDice = Random.nextInt(from = MINIMAL_VALUE, until = MAXIMUN_VALUE)
    val secondDice = Random.nextInt(from = MINIMAL_VALUE, until = MAXIMUN_VALUE)
    return firstDice + secondDice
}

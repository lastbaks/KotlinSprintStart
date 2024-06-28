package org.example.lesson_10

import kotlin.random.Random

const val MIN_VALUE = 1
const val MAX_VALUE = 7

fun main() {
    val humanResult: Int
    val machineResult: Int

    println("Игра 'Кости'. Ваш ход")
    humanResult = getRandomNumber()
    println("Сумма на ваших кубиках = $humanResult")
    machineResult = getRandomNumber()
    println("Сумма на кубиках машины = $machineResult")

    if(humanResult > machineResult) {
        println("Победило человечество")
    } else if (machineResult > humanResult) {
        println("Победили машины")
    } else {
        println("Ничья. человечество и машины договорились поделить планету пополам")
    }
}

fun getRandomNumber(): Int {
    val firstDice = Random.nextInt(from = MIN_VALUE, until = MAX_VALUE)
    val secondDice = Random.nextInt(from = MIN_VALUE, until = MAX_VALUE)
    return firstDice + secondDice
}
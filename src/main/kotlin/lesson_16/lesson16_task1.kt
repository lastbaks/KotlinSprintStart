package org.example.lesson_16

class Dice {
    private val diceRange = 1..6

    fun getRandomNumber() = println(diceRange.random())

}

fun main() {
    val dice = Dice()
    dice.getRandomNumber()
}

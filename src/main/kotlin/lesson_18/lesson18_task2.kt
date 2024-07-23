package org.example.lesson_18

abstract class Dice() {
    abstract fun getRandom(): Int
}

class FourSideDice() : Dice() {
    override fun getRandom(): Int {
        val numbers = (1..4)
        return numbers.random()
    }
}

class SixSideDice() : Dice() {
    override fun getRandom(): Int {
        val numbers = (1..6)
        return numbers.random()
    }
}

class EightSideDice() : Dice() {
    override fun getRandom(): Int {
        val numbers = (1..8)
        return numbers.random()
    }
}

fun main() {
    val forSideDice = FourSideDice()
    val sixSideDice = SixSideDice()
    val eightSideDice = EightSideDice()

    val listOfDices = listOf(forSideDice, sixSideDice, eightSideDice)
    showAllDices(listOfDices)
}

fun showAllDices(dices: List<Dice>) {
    dices.forEach { println(it.getRandom()) }
}
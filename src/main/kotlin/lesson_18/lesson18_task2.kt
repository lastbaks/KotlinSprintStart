package org.example.lesson_18

abstract class Dice(
    val sideCount: IntRange,
) {
    abstract fun getRandom(): Int
}

class FourSideDice(sideCount: IntRange) : Dice(sideCount) {
    override fun getRandom(): Int {
        val numbers = sideCount
        return numbers.random()
    }
}

class SixSideDice(sideCount: IntRange) : Dice(sideCount) {
    override fun getRandom(): Int {
        val numbers = sideCount
        return numbers.random()
    }
}

class EightSideDice(sideCount: IntRange) : Dice(sideCount) {
    override fun getRandom(): Int {
        val numbers = sideCount
        return numbers.random()
    }
}

fun main() {
    val forSideDice = FourSideDice(1..4)
    val sixSideDice = SixSideDice(1..6)
    val eightSideDice = EightSideDice(1..8)

    val listOfDices = listOf(forSideDice, sixSideDice, eightSideDice)
    showAllDices(listOfDices)
}

fun showAllDices(dices: List<Dice>) {
    dices.forEach { println(it.getRandom()) }
}
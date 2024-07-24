package org.example.lesson_18

abstract class Dice(
    val sideCount: Int,
) {
    abstract fun getRandom(): Int
}

class FourSideDice(sideCount: Int = 4) : Dice(sideCount) {
    override fun getRandom(): Int {
        val numbers = (1..sideCount)
        return numbers.random()
    }
}

class SixSideDice(sideCount: Int = 6) : Dice(sideCount) {
    override fun getRandom(): Int {
        val numbers = (1..sideCount)
        return numbers.random()
    }
}

class EightSideDice(sideCount: Int = 8) : Dice(sideCount) {
    override fun getRandom(): Int {
        val numbers = (1..sideCount)
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
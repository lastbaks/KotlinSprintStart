package org.example.lesson_18

abstract class Dice(
    val sideCount: Int,
) {
    abstract fun getRandom(): Int
}

class FourSideDice(sideCount: Int) : Dice(sideCount) {
    override fun getRandom(): Int {
        val numbers = (1..sideCount)
        return numbers.random()
    }
}

class SixSideDice(sideCount: Int) : Dice(sideCount) {
    override fun getRandom(): Int {
        val numbers = (1..sideCount)
        return numbers.random()
    }
}

class EightSideDice(sideCount: Int) : Dice(sideCount) {
    override fun getRandom(): Int {
        val numbers = (1..sideCount)
        return numbers.random()
    }
}

fun main() {
    val forSideDice = FourSideDice(4)
    val sixSideDice = SixSideDice(6)
    val eightSideDice = EightSideDice(8)

    val listOfDices = listOf(forSideDice, sixSideDice, eightSideDice)
    showAllDices(listOfDices)
}

fun showAllDices(dices: List<Dice>) {
    dices.forEach { println(it.getRandom()) }
}
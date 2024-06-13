package org.example.lesson_2

fun main() {
    val cristalOre: Int = 7
    val ironOre: Int = 11
    val koeffecient: Float = 1.2f
    val cristalOreBonusCount: Int = ((cristalOre * koeffecient).toInt() - cristalOre)
    val ironOreBonusCount: Int = ((ironOre * koeffecient).toInt() - ironOre)

    println("Кристаллическая руда: $cristalOreBonusCount")
    println("Железная руда: $ironOreBonusCount")
}
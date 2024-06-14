package org.example.lesson_3

fun main() {
    val movingData: String = "D2-D4;0"
    val startPosition: String = movingData.substring(0,2)
    val endPosition: String = movingData.substring(3,5)
    val moveNumber: String = movingData.substring(6)

    println(startPosition)
    println(endPosition)
    println(moveNumber)
}
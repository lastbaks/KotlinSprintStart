package org.example.lesson_3

fun main() {
    val movingData: String = "D2-D4;0"

    val parsedMovingData = movingData.split("-", ";")
    println(parsedMovingData[0])
    println(parsedMovingData[1])
    println(parsedMovingData[2])
}
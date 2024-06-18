package org.example.lesson_2

import java.math.RoundingMode
import kotlin.math.pow

fun main() {
    val deposit = 70000
    val sum = deposit * ((1 + 0.167).pow(20))
    val roundSum = sum.toBigDecimal().setScale(3, RoundingMode.DOWN).toDouble()
    println(roundSum)
}
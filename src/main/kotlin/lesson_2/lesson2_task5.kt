package org.example.lesson_2

import java.math.RoundingMode
import kotlin.math.pow

fun main() {
    val deposit = 70000
    val procentRate = 16.7
    val countOfYears = 20
    val sum = deposit * ((1 + (procentRate * 0.01)).pow(countOfYears))
    val roundSum = sum.toBigDecimal().setScale(3, RoundingMode.DOWN).toDouble()
    println(roundSum)
}
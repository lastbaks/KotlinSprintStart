package org.example.lesson_21

fun List<Int>.evenNumbersSum() = this.filter { it % 2 == 0 }.sum()

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenNumbersSum = numbers.evenNumbersSum()
    println(evenNumbersSum)
}
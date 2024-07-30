package org.example.lesson_21

fun List<Int>.evenNumbersSum(numbers: List<Int>): Int {
    val evenNumbers = mutableListOf<Int>()

    numbers.forEach {
        if (it % 2 == 0) {
            evenNumbers.add(it)
        }
    }
    return evenNumbers.sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenNumberSum = numbers.evenNumbersSum(numbers)
    println(evenNumberSum)
}
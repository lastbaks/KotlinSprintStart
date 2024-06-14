package org.example.lesson_4

const val COUNT_OF_TABLES = 13

fun main() {
    val bookedOnToday = 13
    val bookedOnNextday = 9
    println("Доступность столиков на сегодня:  ${bookedOnToday < COUNT_OF_TABLES}")
    println("Доступность столиков на завтра:  ${bookedOnNextday < COUNT_OF_TABLES}")

}
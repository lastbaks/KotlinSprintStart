package org.example.lesson_1

fun main() {

    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println(year)
    println(hour)
    println(minute)

    hour = 10
    minute = 55

    println("$hour:$minute")
    //и вариант печати по предполагаемой подсказке из задания с использованием нескольких функций print()
    print(hour)
    print(":")
    print(minute)

}
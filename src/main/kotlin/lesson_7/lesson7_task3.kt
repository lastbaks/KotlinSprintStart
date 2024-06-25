package org.example.lesson_7

fun main() {
    println("Введите число")
    val value = readln().toInt()
    val range: IntProgression = 0 .. value step 2
    for (i in range) {
        println(i)
    }
}
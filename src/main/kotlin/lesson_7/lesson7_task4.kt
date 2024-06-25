package org.example.lesson_7

fun main() {
    println("Введите число - на сколько секунд поставить таймер")
    var counter = readln().toInt()
    for (i in counter downTo 1) {
        println (counter--)
        Thread.sleep(1000)
    }
    println("Время вышло")
}
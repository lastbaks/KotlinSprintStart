package org.example.lesson_6
const val message = "время вышло"
fun main() {
    var countOfSeconds: Int
        println("Введите количество секунд для запуска таймера")
    countOfSeconds = readln().toInt()
    while (countOfSeconds > 0) {
        println("Осталсь ${countOfSeconds--} секунд")
        Thread.sleep(1000)
    }
    println(message)
}
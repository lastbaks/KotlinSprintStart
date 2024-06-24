package org.example.lesson_6

fun main() {
    var countOfSeconds: Int
    val message: String
    println("Введите количество секунд, чтобы запустить таймер")
    countOfSeconds = readln().toInt()
    message = "Прошло $countOfSeconds секунд"
    while (countOfSeconds > 0) {
        countOfSeconds--
        Thread.sleep(1000)
    }
    println(message)
}
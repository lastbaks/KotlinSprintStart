package org.example.lesson_6

fun main() {
    var countOfSeconds: Long
    val message: String
    println("Введите количество секунд, чтобы запустить таймер")
    countOfSeconds = readln().toLong()
    message = "Прошло $countOfSeconds секунд"
    Thread.sleep(countOfSeconds * 1000)
    println(message)
}
package org.example.lesson_6

fun main() {
    var countOfSeconds: Int
    val message: String
    println("Введите о чем вы хотите, чтобы я напомнил")
    message = readln()
    println("Введите количество секунд, через которые нужно воспроизвести напоминание")
    countOfSeconds = readln().toInt()
    while (countOfSeconds > 0) {
        println("Осталсь ${countOfSeconds--} секунд")
        Thread.sleep(1000)
    }
    println(message)
}
package org.example.lesson_5

import java.time.LocalDate

fun main() {
    println("Введите год рождения")
    val ageOfBirth = readLine()!!.toInt()
    val currentYear = LocalDate.now().year
    val message = if((currentYear - ageOfBirth) >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {"Доступ запрещен"}
    println(message)
}

const val AGE_OF_MAJORITY = 18

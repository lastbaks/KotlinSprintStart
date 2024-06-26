package org.example.lesson_7

fun main() {
    val charset = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    val password: String
    var length = 1

    while (length < 6) {
        println("Генерация пароля. Введите желаему длину. Минимум 6 символов")
        length = readln().toInt()
    }

    password = List(length) { charset.random() }.joinToString("")
    println(password)

}
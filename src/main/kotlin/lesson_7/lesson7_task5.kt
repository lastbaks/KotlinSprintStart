package org.example.lesson_7

fun main() {
    val smallLetters = 'a'..'z'
    val bigLetters = 'A'..'Z'
    val intValues = 0..9
    val charset = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    var password = ""
    var length = 1

    while (length < 6) {
        println("Генерация пароля. Введите желаему длину. Минимум 6 символов")
        length = readln().toInt()
    }

    password += smallLetters.random()
    password += bigLetters.random()
    password += intValues.random()
    password += List(length - 3) { charset.random() }.joinToString("")
    println(password)
}
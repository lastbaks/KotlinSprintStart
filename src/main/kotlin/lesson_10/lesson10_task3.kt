package org.example.lesson_10

fun main() {
    println("Введите желаемую длину пароля")
    println(generatePassword(readln().toInt()))
}

fun generatePassword(passLength: Int): String {
    val randomInt: IntRange = 1..9
    val randomLetter = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/')
    var password = ""
    while (password.length < passLength) {
        if (password.length % 2 == 0) {
            password += randomInt.random()
        } else {
            password += randomLetter.random()
        }
    }
    return  password
}
package org.example.lesson_10

const val MINIMAL_LENGTH = 4

fun main() {
    val login: String
    val password: String

    println("Введите логин")
    login = readln()
    println("Введите пароль")
    password = readln()

    println(checkLength(login, password))
}

fun checkLength(loginValue: String, passwordValue: String): String {
    if ((loginValue.length < MINIMAL_LENGTH) || (passwordValue.length < MINIMAL_LENGTH)) {
        return "Логин или пароль недостаточно длинные"
    } else {
        return "Добро пожаловать"
    }
}
package org.example.lesson_6

fun main() {
    val userName: String
    val userPassword: String
    var currentName: String
    var currentPassword: String

    println("Регистрация нового пользователя. Введите желаемое имя пользователя")
    userName = readln()
    println("Придумайте и введите пароль")
    userPassword = readln()
    println("Пользователь $userName зарегистрирован.")
    println("Авторизация. Введите имя пользователя")
    currentName = readln()
    while (currentName != userName) {
        println("Неверное имя пользователя, повторите ввода")
        currentName = readln()
    }
    println("Введите пароль")
    currentPassword = readln()
    while (currentPassword != userPassword) {
        println("Неверный пароль, повторите ввод")
        currentPassword = readln()
    }
    println("Авторизиация прошла успешно")
}
package org.example.lesson_11

fun main() {
    val user001 = User2( id = 1,
        login = "Slartibartfast",
        password = "Earthbuilder1979",
        email = "god@gmail.com"
    )

    val user002 = User2(2,
        login = "Bear",
        password = "C2dfg_342!45",
        email = "bear@forest"
    )

    user001.printInfo()
    user001.addNote()
    user001.changePassword()
    user001.printInfo()
}

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printInfo() {
        println("Логин: $login")
        println("Пароль: $password")
        println("Адрес электронной почты $email")
        if (bio != null) {
            println("О себе: $bio")
        }
    }

    fun addNote() {
        println("Добавьте информацию о себе")
        bio = readln()
    }

    fun changePassword() {
        println("Изменение пароля. Введите текущий пароль:")
        var newPassword = readln()
        while (newPassword != password) {
            println("Введенынй пароль неверен. Введите текущий пароль")
            newPassword = readln()
        }
        println("Введите новый пароль")
        password = readln()
    }
}

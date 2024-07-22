package org.example.lesson_17

class User(userLogin: String, userPassword: String) {
    var userLogin: String = userLogin
        get() = field
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var userPassword: String = userPassword
        get() = getPassword(field)
        set(value) {
            println("Вы не можете изменять пароль")
        }

    private fun getPassword(field: String): String {
        var newStroke = ""
        newStroke += "*".repeat(field.length)
        return newStroke
    }
}

fun main() {
    val user1 = User("Luntik", "pass")
    println("Имя пользователя: ${user1.userLogin}")
    println("Пароль: ${user1.userPassword}")
    user1.userPassword = "myNewPassword"
    println("Пароль: ${user1.userPassword}")
    user1.userLogin = "Luntik-multik"
    println("Имя пользователя: ${user1.userLogin}")
}
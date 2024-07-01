package org.example.lesson_10

const val USER_LOGIN = "user"
const val USER_PASSWORD = "password"
const val ITEMS = ("соль, хлеб, молоко")

fun main() {
    println(generateToken())
    println(getItems(checkCredentials()))
}

fun checkCredentials() : String?{
    println("Введите логин")
    val inputLogin = readln()
    println("Введите пароль")
    val inputPassword = readln()
    if ((inputLogin != USER_LOGIN) || (inputPassword != USER_PASSWORD)) {
        return null
    } else {
        return generateToken()
    }
}

fun getItems(credentials: String?) : String{
    if (credentials == null) {
        return "Ошибка авторизации"
    } else {
        val items = ITEMS
        return items
    }
}

fun generateToken(): String {
    val randomInt = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..32).map { randomInt.random() }.joinToString("")
}
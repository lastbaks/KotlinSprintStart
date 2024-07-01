package org.example.lesson_10

const val USER_LOGIN = "user"
const val USER_PASSWORD = "password"
const val ITEMS = ("соль, хлеб, молоко")

fun main() {
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
        var randomInt = (0 ..9).random()
        var randomChar = ('a' .. 'z').random()
        val token: String
        val userPartOfToken: String = inputLogin + inputPassword
        var servicePartOfToken = (randomInt).toString() + randomChar
        while (servicePartOfToken.length < (32 - userPartOfToken.length)) {
            randomInt = (0 ..9).random()
            randomChar = ('a' .. 'z').random()
            servicePartOfToken += randomInt
            servicePartOfToken += randomChar
        }
        token = userPartOfToken + servicePartOfToken
        return token
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
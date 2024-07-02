package org.example.lesson_11

fun main() {
    val user001 = User( id = 1,
        login = "fox",
        password = "fox2002",
        email = "fox@forest.com"
    )

    val user002 = User(2,
        login = "Bear",
        password = "C2dfg_342!45",
        email = "bear@forest"
    )

    val listOfUsers = listOf(user001, user002)
    listOfUsers.forEach {
        printUserInfo(it)
    }

}

class User (
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun printUserInfo(userName: User) {
    println("Пользователь № ${userName.id}")
    println("Логин:  ${userName.login}")
    println("Пароль:  ${userName.password}")
    println("Адрес электронной почты:  ${userName.email}")
}
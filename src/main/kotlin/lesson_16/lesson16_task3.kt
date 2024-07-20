package org.example.lesson_16

class User(
    val userName: String,
    private val userPassword: String,
) {
    fun validatePassword(inputPassword: String) = inputPassword == userPassword
}

fun main() {
    val user1 = User("Zafod", "ZafodTheGreat")
    println(user1.validatePassword("ZafodIsGreat"))
}
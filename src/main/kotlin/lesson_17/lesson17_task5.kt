package org.example.lesson_17

class User(userLogin: String, userPassword: String) {
    var userLogin: String = userLogin
        get() = field
    var userPassword: String = userPassword
        get() = getPassword(field)
        set(value) {
            println("Вы не можете изменять пароль")
        }

    fun getPassword(pass: String): String {
        val listOfChar = pass.toMutableList()
        listOfChar.fill('*')
        val newStroka = listOfChar.joinToString("")
        return newStroka
    }
}

fun main() {
    val user1 = User("Luntik", "pass")
    println("Имя пользователя: ${user1.userLogin}")
    println("Пароль: ${user1.userPassword}")
    user1.userPassword = "myNewPassword"
    println("Пароль: ${user1.userPassword}")

}
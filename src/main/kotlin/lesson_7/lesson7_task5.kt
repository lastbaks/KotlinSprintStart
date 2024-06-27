package org.example.lesson_7

fun main() {
    val password = mutableListOf<Char>()
    val smallLetters = 'a'..'z'
    val bigLetters = 'A'..'Z'
    val intValues = 0..9
    val charset = bigLetters + smallLetters + intValues
    var randomString = ""
    var length = 1

    while (length < 6) {
        println("Генерация пароля. Введите желаемую длину. Минимум 6 символов")
        length = readln().toInt()
    }
    randomString += smallLetters.random()
    randomString += bigLetters.random()
    randomString += intValues.random()
    randomString += List(length - 3) { charset.random() }.joinToString("")

    for (char in randomString) {
        password.add(char)
    }
    password.shuffle()
    password.forEach{
        print(it)
    }
}
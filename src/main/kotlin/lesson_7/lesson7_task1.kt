package org.example.lesson_7

fun main() {
    val charset = ('a'..'z') + ('0'..'9')
    val length = 6
    val passwordOne = List(length) { charset.random() }.joinToString("")
    println(passwordOne)


    val passwordTwo = mutableListOf<String>()
    var randomInt: String
    var randomChar: String
    for(i in 1..3) {
        randomInt = (1..9).random().toString()
        passwordTwo.add(randomInt)
        randomChar = ('a'..'z').random().toString()
        passwordTwo.add(randomChar)
    }
    println(passwordTwo.joinToString(""))
}

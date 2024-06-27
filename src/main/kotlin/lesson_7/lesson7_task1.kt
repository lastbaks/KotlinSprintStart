package org.example.lesson_7

const val PASSWORD_HALF_LENGTH = 3
fun main() {
    val rndInt: IntRange = 1..9
    val rndLetter: CharRange = 'a'..'z'
    var password = ""
    for(i in 1 .. PASSWORD_HALF_LENGTH) {
        password += rndLetter.random()
        password += rndInt.random()
    }
    println(password)
}

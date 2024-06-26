package org.example.lesson_8

fun main() {
    println("Сколько ингридиентов вы планируете ввести? введите число")
    val countOfIngredients = readln().toInt()
    val arrayOfIngredients = arrayOfNulls<String>(countOfIngredients)
    var message = ""
    for (i in 0 until arrayOfIngredients.size) {
        println("Введите элемент ${i + 1}")
        arrayOfIngredients[i] = readln()
    }
    for (i in arrayOfIngredients) {
        message += i
        message += ", "
    }
    message = message.dropLast(2)
    println(message)
}
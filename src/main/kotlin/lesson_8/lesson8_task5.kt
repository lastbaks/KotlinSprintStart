package org.example.lesson_8

fun main() {
    println("Сколько ингридиентов вы планируете ввести? введите число")
    val countOfIngredients = readln().toInt()
    val arrayOfIngredients = Array(countOfIngredients) {""}

    for (i in 0 until arrayOfIngredients.size) {
        println("Введите элемент ${i + 1}")
        arrayOfIngredients[i] = readln()
    }
    println(arrayOfIngredients.joinToString())
}
package org.example.lesson_9

fun main() {
    println("Введите 5 названий ингредиентов, разделяя их запятой и пробелом")
    val input = readln()
    val listOfIngredients = input.split(", ")
    val sortedListOfIngredients = listOfIngredients.sorted()
    sortedListOfIngredients.forEach{
        println(it)
    }
}
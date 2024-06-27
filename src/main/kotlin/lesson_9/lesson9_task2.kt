package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("колбаса", "огурец", "горошек")
    println("В репепте есть базовые ингредиенты:")
    listOfIngredients.forEach {
        println(it)
    }
    println("Желаете добавить еще?")
    if (readln() == "нет") return
    else {
        println("Какой ингридиент вы хотите добавить?")
        listOfIngredients.add(readln())
        println("Теперь в списке рецептов следующие инредиенты:")
        listOfIngredients.forEach {
            println(it)
        }
    }
}
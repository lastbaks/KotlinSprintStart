package org.example.lesson_9

const val COUNT_OF_INGREDIENTS = 5

fun main() {
    val setOfIngredients = mutableSetOf<String>()

    for (i in 0 until COUNT_OF_INGREDIENTS) {
        println("Введите название ингридиента")
        setOfIngredients.add(readln())
    }

    val message = setOfIngredients.joinToString(",").replaceFirstChar { it.uppercaseChar() }
    println(message)
}
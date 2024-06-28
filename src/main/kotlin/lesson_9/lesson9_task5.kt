package org.example.lesson_9

import java.util.*

const val COUNT_OF_INGREDIENTS = 5

fun main() {
    val listOfIngredients = mutableListOf<String>()

    for (i in 0 until COUNT_OF_INGREDIENTS){
        println("Введите название ингридиента")
        listOfIngredients.add(readln())
    }
    val uniqueIngredients = (listOfIngredients.distinct()).joinToString(separator = ",")
    val capitalizedString = uniqueIngredients.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(listOfIngredients.joinToString(separator = ","))
    println(capitalizedString)
}
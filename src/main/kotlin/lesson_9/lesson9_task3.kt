package org.example.lesson_9

fun main() {
    val countOfIngredients = mutableListOf(2, 50, 15)
    val countOfPortions: Int
    println("Рецепт: Омлет")
    println("Какое количество порций вы хотите приготовить?")
    countOfPortions = readln().toInt()
    println("На $countOfPortions порций вам понадобится:")
    println("Яиц - ${countOfIngredients[0] * countOfPortions} штук.")
    println("Молоко - ${countOfIngredients[1] * countOfPortions} миллилитров.")
    println("Сливочное масло - ${countOfIngredients[2] * countOfPortions} грамм.")
}
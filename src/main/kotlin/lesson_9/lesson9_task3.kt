package org.example.lesson_9

fun main() {
    val ingredients: MutableMap<String, Int> =
        mutableMapOf("яйцо (шт)" to 2, "молоко (мл)" to 50, "сливочное масло (грамм)" to 15)
    val countOfPortions: Int
    println("Рецепт: Омлет")
    println("Какое количество порций вы хотите приготовить?")
    countOfPortions = readln().toInt()
    println("На $countOfPortions порций вам понадобится:")
    for ((key, value ) in ingredients) {
        println("$key - ${value * countOfPortions}")
    }
}
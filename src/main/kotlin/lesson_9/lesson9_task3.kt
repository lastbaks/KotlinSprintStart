package org.example.lesson_9

fun main() {
    val ingredientName = listOf("яйцо (шт)", "молоко (мл)", "сливочное масло (грамм)" )
    val ingredientCount = listOf(2, 50, 15)
    var countOfPortions: Int = 1
    val countInRecept = ingredientCount.map { it * countOfPortions }
    println("Рецепт: Омлет")
    println("Какое количество порций вы хотите приготовить?")
    countOfPortions = readln().toInt()
    println("На $countOfPortions порций вам понадобится:")
    for (i in 0 until  ingredientName.size) {
        println("${ingredientName[i]} - ${countInRecept[i]}")
    }
}
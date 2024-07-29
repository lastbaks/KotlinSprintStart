package org.example.lesson_20

fun main() {
    val listItems = listOf("Элемент 1", "Элемент 2", "Элемент 3", "Элемент 4")

    val listOfLambdas = listItems.map { item ->
        { println("Нажат элемент $item") }
    }

    listOfLambdas.forEachIndexed { index, pressItem ->
        if (index % 2 == 1) {
            pressItem()
        }
    }
}
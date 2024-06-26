package org.example.lesson_8

fun main() {
    val arrayOfIngrigients = arrayOf("колбаса", "огурец", "горошек", "майонез", "яблоко")
    val ingridient: String
    println("Напишите ингридиент, который вы хотите найти")
    ingridient = readln()

    for (i in arrayOfIngrigients) {
        if (i == ingridient) {
            println("Ингридиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингридиента в рецепте нет")
}
package org.example.lesson_8

fun main() {
    val arrayOfIngrigients = arrayOf("колбаса", "огурец", "горошек", "майонез", "яблоко")
    val ingridient: String
    println("Напишите ингридиент, который вы хотите найти")
    ingridient = readln()
    if(ingridient in arrayOfIngrigients) {
        println("Ингридиент $ingridient в рецепте есть")
    } else {
        println("Такого ингридиента в рецепте нет")
    }
}
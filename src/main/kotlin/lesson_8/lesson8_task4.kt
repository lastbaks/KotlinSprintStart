package org.example.lesson_8

fun main() {
    val arrayOfIngregients = arrayOf("колбаса", "огурец", "горошек", "майонез", "яблоко")
    val ingredientToChange: String
    val newIngredient: String
    for (i in arrayOfIngregients) {
        println("Ингридиент ${arrayOfIngregients.indexOf(i) + 1}: $i")
    }
    println("Какой ингридиент вы хотите заменить")
    ingredientToChange = readln()
    if (ingredientToChange !in arrayOfIngregients) {
        println("Такого ингридиента нет")
    } else {
        println("На какой Ингредиент вы хотите заменить $ingredientToChange?")
        newIngredient = readln()
        arrayOfIngregients[arrayOfIngregients.indexOf(ingredientToChange)] = newIngredient
        println("Готово. Вы сохранили следующий список:")
        for (i in arrayOfIngregients) {
            println("Ингридиент ${arrayOfIngregients.indexOf(i) + 1}: $i")
        }
    }
}
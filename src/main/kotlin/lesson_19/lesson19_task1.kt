package org.example.lesson_19

enum class Fish (val printName: String) {
    GUPPI("Гуппи"),
    ANGELFISH ("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}

fun main() {
    println("Вы можете добавить в аквариум следующих рыбок:")
    for (fishNames in Fish.entries) {
        println(fishNames.printName)
    }
}
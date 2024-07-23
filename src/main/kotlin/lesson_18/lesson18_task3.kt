package org.example.lesson_18

abstract class Pet {
    abstract val name: String
    abstract fun getFood()
}

class Fox(override val name: String) : Pet() {
    override fun getFood() {
        println("$name ест ягоды")
    }
}

class Dog(override val name: String) : Pet() {
    override fun getFood() {
        println("$name ест кости")
    }
}

class Cat(override val name: String) : Pet() {
    override fun getFood() {
        println("$name ест рыбу")
    }
}

fun main() {
    val pet1 = Fox("Лиса-Алиса")
    val pet2 = Dog("Рекс")
    val pet3 = Cat("Барсик")
    val pets = listOf<Pet>(pet1, pet2, pet3)
    pets.forEach { it.getFood() }
}
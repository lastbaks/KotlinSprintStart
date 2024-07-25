package org.example.lesson_19

class SpaceShip(
    val name: String
) {
    fun takeOff() {
        //TODO Прописать метод взлета
    }

    fun landing() {
        //TODO Прописать метод приземления
    }

    fun shoot() {
        TODO()
    }
}

fun main() {
    val ship1 = SpaceShip("sokol")
    ship1.takeOff()
    ship1.landing()
    ship1.shoot()
}
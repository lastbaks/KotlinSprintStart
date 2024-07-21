package org.example.lesson_17

class Ship {
    var shipName: String = "Арктика"
        get() = field
        set(value) {
            println("Изменение имени корабля запрещено")
        }
    var averageSpeed: Int = 60
    val homePort: String = "Singapore"
}

fun main() {
    val ship1 = Ship()
    ship1.shipName = "Полярный"
    println(ship1.shipName)
}
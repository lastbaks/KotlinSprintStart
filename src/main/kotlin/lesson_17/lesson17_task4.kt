package org.example.lesson_17

class Package {
    val packageNumber: Int = 10
    var moveCounter: Int = 0
    var currentLocation: String = "Луна сортировочная"
        set(value) {
            field = value
            moveCounter += 1
        }
}

fun main() {
    val package1 = Package()
    println(package1.currentLocation)
    println(package1.moveCounter)
    package1.currentLocation = "Фобос сортировочная"
    println(package1.currentLocation)
    println(package1.moveCounter)
    package1.currentLocation = "Ганимед."
    println(package1.currentLocation)
    println(package1.moveCounter)
}
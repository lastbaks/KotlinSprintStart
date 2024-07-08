package org.example.lesson_14

open class LinerShip(
    val maxSpeed: Int = 45,
    val maxCargoWeight: Int = 20000,
    val maxPassengersCount: Int = 900,
    val isIcebreaker: Boolean = false,
)

class CargoShip(
    maxSpeed: Int = 35,
    maxCargoWeight: Int = 150000,
    maxPassengersCount: Int = 160,
) : LinerShip(maxSpeed, maxCargoWeight, maxPassengersCount)

class IcebreakerShip(
    maxSpeed: Int = 30,
    maxCargoWeight: Int = 80000,
    maxPassengersCount: Int = 100,
) : LinerShip(maxSpeed, maxCargoWeight, maxPassengersCount, isIcebreaker = true)

fun main() {
    val simphonyOfSeas = LinerShip()
    val prelude = CargoShip()
    val arctic = IcebreakerShip()
    println(arctic.maxSpeed)
}
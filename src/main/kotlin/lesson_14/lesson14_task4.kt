package org.example.lesson_14

abstract class SpaceObject(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val satellites: MutableList<Satellite> = mutableListOf()
) : SpaceObject(name, hasAtmosphere, isSuitableForLanding)

class Satellite(
    objectName: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean
) : SpaceObject(objectName, hasAtmosphere, isSuitableForLanding)

fun main() {

    val planet1 = Planet("Фаэтон", true, true)
    val satellite1 = Satellite("Марс", true, true)
    val satellite2 = Satellite("Аква", true, false)

    planet1.satellites.add(satellite1)
    planet1.satellites.add(satellite2)

    println("Планета ${planet1.name}")
    println("Спутники планеты:")
    planet1.satellites.forEach { println(it.name) }
}

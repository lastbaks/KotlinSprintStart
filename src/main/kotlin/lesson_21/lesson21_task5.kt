package org.example.lesson_21

fun Map<String, Int>.maxCategory() = maxByOrNull { it.value }?.key

fun main() {

    val skills: MutableMap<String, Int> = mutableMapOf(
        "meleeWeapon" to 5,
        "nightVision" to 5,
        "hunting" to 4,
    )

    println(skills.maxCategory())
}
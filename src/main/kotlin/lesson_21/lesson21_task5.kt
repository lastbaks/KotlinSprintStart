package org.example.lesson_21

class Player3(
    val name: String,
    var skills: MutableMap<String, Int> = mutableMapOf(
        "meleeWeapon" to 5,
        "nightVision" to 5,
        "hunting" to 4,
    )
)

fun Player3.maxCategory() = skills.maxByOrNull { it.value }?.key

fun main() {
    val player1 = Player3("Rudolf")

    println(player1.maxCategory())
    player1.skills["hunting"] = 6
    println(player1.maxCategory())
}


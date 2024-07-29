package org.example.lesson_20

class Player20_3(
    val name: String,
    var hasRedKey: Boolean,
)

fun main() {

    val openTheDoor: (Player20_3) -> Unit = { player ->

        if (player.hasRedKey) {
            println("Дверь открыта")
        } else {
            println("Нет красного ключа")
        }
    }

    val player1 = Player20_3("Hero", false)
    openTheDoor(player1)
    player1.hasRedKey = true
    openTheDoor(player1)
}
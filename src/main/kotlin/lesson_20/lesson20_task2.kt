package org.example.lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int)

fun main() {
    val healthPotion: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("Здоровье игрока ${player.name} восстановлено: ${player.currentHealth} из ${player.maxHealth}.")

    }
    val player1 = Player("Hero", 70, 100)

    healthPotion(player1)
}
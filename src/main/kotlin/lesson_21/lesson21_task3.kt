package org.example.lesson_21

class Player_21_3(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int)

fun main() {
    val healthPotion: (Player_21_3) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("Здоровье игрока ${player.name} восстановлено: ${player.currentHealth} из ${player.maxHealth}.")

    }
    val player1 = Player_21_3("Hero", 70, 100)
    println(player1.isHealthy())
    healthPotion(player1)
    println(player1.isHealthy())
}

fun Player_21_3.isHealthy() : Boolean {
    if (currentHealth == maxHealth){
        return true
    }
    return false
}
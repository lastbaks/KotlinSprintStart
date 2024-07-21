package org.example.lesson_16

const val HEALTH_POTION = 20

class Player(
    val name: String,
    private var damage: Int,
    private var health: Int,
    private var isDead: Boolean,
) {

    fun takeDamage(enemyDamage: Int) {
        health -= enemyDamage
        if (health <= 0) {
            death()
        }
        println("Ударом нанесен урон $enemyDamage единиц. Осталось $health единиц жизни")
    }

    fun takeHealthPotion() {
        if (!isDead) {
            health += HEALTH_POTION
            println("$name выпил лекарство.  Осталось $health единиц жизни")
        } else {
            println("Игрок мертв. Лечение невозможно")
        }
    }

    private fun death() {
        isDead = true
        health = 0
        damage = 0
    }
}

fun main() {
    val player1 = Player("Hetomukira", 10, 100, false)
    player1.takeDamage(40)
    player1.takeHealthPotion()
    player1.takeDamage(50)
    player1.takeHealthPotion()
    player1.takeDamage(60)
    player1.takeHealthPotion()
}
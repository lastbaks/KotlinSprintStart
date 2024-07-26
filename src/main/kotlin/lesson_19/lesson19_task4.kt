package org.example.lesson_19

enum class Ammo(val baseDamage: Int, val label: String) {
    BLUE_BULLETS(5, "Базовый калибр"),
    GREEN_BULLETS(10, "Бронебойный"),
    RED_BULLETS(20, "Кумулятивный"),
    NO_BULLETS(0, "заряд отсутствует"),
}

class Tank(
    var typeAmmo: Ammo
) {
    fun changeAmmo(type: Ammo) {
        typeAmmo = (when (type) {
            Ammo.BLUE_BULLETS -> Ammo.BLUE_BULLETS
            Ammo.GREEN_BULLETS -> Ammo.GREEN_BULLETS
            Ammo.RED_BULLETS -> Ammo.RED_BULLETS
            Ammo.NO_BULLETS -> Ammo.NO_BULLETS
        })
        println("Изменен тип боеприпасов на ${typeAmmo.label}")
    }

    fun takeShoot() {
        if (typeAmmo != Ammo.NO_BULLETS){
            println("Выстрел произведен. Урон: ${typeAmmo.baseDamage} единиц")
        } else {
            println("Выстрел невозможен. Зарядите орудие")
        }
    }
}

fun main() {
    val tank1 = Tank(Ammo.NO_BULLETS)
    tank1.takeShoot()
    tank1.changeAmmo(Ammo.RED_BULLETS)
    tank1.takeShoot()
    tank1.changeAmmo(Ammo.GREEN_BULLETS)
    tank1.takeShoot()
}
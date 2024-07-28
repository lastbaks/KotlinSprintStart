package org.example.lesson_19

enum class Ammo(val baseDamage: Int?, val label: String) {
    BLUE_BULLETS(5, "Базовый калибр"),
    GREEN_BULLETS(10, "Бронебойный"),
    RED_BULLETS(20, "Кумулятивный"),
}

class Tank(
    var typeAmmo: Ammo? = null
) {
    fun insertAmmo(type: Ammo) {
        typeAmmo = (when (type) {
            Ammo.BLUE_BULLETS -> Ammo.BLUE_BULLETS
            Ammo.GREEN_BULLETS -> Ammo.GREEN_BULLETS
            Ammo.RED_BULLETS -> Ammo.RED_BULLETS
//            Ammo.NO_BULLETS -> Ammo.NO_BULLETS
        })
        println("Установлен тип боеприпасов на ${typeAmmo!!.label}")
    }

    fun takeShoot() {
        if (typeAmmo != null){
            println("Выстрел произведен. Урон: ${typeAmmo?.baseDamage} единиц")
        } else {
            println("Выстрел невозможен. Зарядите орудие")
        }
    }

    fun removeAmmo() {
        typeAmmo = null
    }
}

fun main() {
    val tank1 = Tank()
    tank1.takeShoot()
    tank1.insertAmmo(Ammo.RED_BULLETS)
    tank1.takeShoot()
    tank1.insertAmmo(Ammo.GREEN_BULLETS)
    tank1.takeShoot()
    tank1.removeAmmo()
    tank1.takeShoot()
    tank1.insertAmmo(Ammo.BLUE_BULLETS)
    tank1.takeShoot()
}
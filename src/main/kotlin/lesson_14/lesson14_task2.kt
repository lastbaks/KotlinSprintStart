package org.example.lesson_14

open class LinerShipVersion2(
    val type: String = "Пассажирский лайнер",
    val name: String,
    val maxSpeed: Int = 45,
    val maxCargoWeight: Int = 20000,
    val maxPassengersCount: Int = 900,
    val isIcebreaker: Boolean = false,
) {
    open fun startLoading() {
        println("Горизонтальный трап со шкафута выдвинут")
        println()
    }

    fun sendShipInfo() {
        println("$type $name ожидает разрешения входа в порт")
        println("Параметры корабля:")
        println("Максимальная скорость $maxSpeed узлов.")
        println("Грузоподъемность $maxCargoWeight тонн.")
        println("Вместимость $maxPassengersCount пассажиров.")
        if(isIcebreaker) {
            println("Можем оказать помощь в разбивании ледяной корки в портовой зоне")
        }
        println()
    }
}

class CargoShipVersion2(
    type: String = "Грузовое судно",
    name: String,
    maxSpeed: Int = 35,
    maxCargoWeight: Int = 150000,
    maxPassengersCount: Int = 160,
) : LinerShipVersion2(type, name, maxSpeed, maxCargoWeight, maxPassengersCount) {
    override fun startLoading() {
        println("Активирован погрузочный кран")
        println()
    }
}

class IcebreakerShipVersion2(
    type: String = "Ледокол",
    name: String,
    maxSpeed: Int = 30,
    maxCargoWeight: Int = 80000,
    maxPassengersCount: Int = 100,
) : LinerShipVersion2(type, name, maxSpeed, maxCargoWeight, maxPassengersCount, isIcebreaker = true) {
    override fun startLoading() {
        println("Погрузочные ворота на корме открыты")
        println()
    }
}

fun main() {
    val simphonyOfSeas = LinerShipVersion2(name = "SimphonyOfSeas")
    val prelude = CargoShipVersion2(name = "Prelude")
    val arctic = IcebreakerShipVersion2(name = "Arctic")

    simphonyOfSeas.sendShipInfo()
    simphonyOfSeas.startLoading()
    prelude.sendShipInfo()
    prelude.startLoading()
    arctic.sendShipInfo()
    arctic.startLoading()
}
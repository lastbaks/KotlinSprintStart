package org.example.lesson_15

abstract class Car(
    val type: String,
    val name: String,
)

interface Movable {

    var isEngineStarted: Boolean

    fun startEngine() {
        isEngineStarted = true
        println("Двигатель включен")
    }

    fun stopEngine() {
        isEngineStarted = false
        println("Двигатель выключен")
    }

    fun startMoving() {
        if (isEngineStarted == true) {
            println("Начинаю движение")
        } else {
            println("Двигатель не включен, движение невозможно")
        }
    }
}

interface PassengersTransportation {
    val maxPassengersCount: Int
    var currentPassengersCount: Int

    fun boardingPassengers(carType: String, carName: String) {
        if (currentPassengersCount < maxPassengersCount) {
            currentPassengersCount += 1
            println("$carType $carName: Производится посадка")
            println("Количество пассажиров: $currentPassengersCount")
            println("Свободных мест: ${maxPassengersCount - currentPassengersCount}")
        } else {
            println("Все места заняты")
        }
    }

    fun unboardingPassengers(terminal: Terminal) {
        println("Производится высадка пассажиров")
        println("Доставлено $currentPassengersCount пассажиров")
        terminal.countArrivedPassengers += currentPassengersCount
        currentPassengersCount = 0
    }
}

interface CargoTransportation {
    val maxCargoWeight: Int
    var currentCargoWeight: Int
    fun loadCargo(carType: String, carName: String) {
        val oneCargoUnit = 250
        if (currentCargoWeight < maxCargoWeight) {
            currentCargoWeight += oneCargoUnit
            println("$carType $carName: Добавлен один ящик груза")
            println("Текущая загруженность транспорта: $currentCargoWeight")
            println("Еще можно загрузить: ${maxCargoWeight - currentCargoWeight} килограмм.")
        } else {
            println("Грузовик полон, добавление груза невозможно")
        }
    }

    fun unloadCargo(terminal: Terminal) {
        println("Производится выгрузка груза")
        println("Доставлено $currentCargoWeight килограммов груза")
        terminal.countDeliveredCargo += currentCargoWeight
        currentCargoWeight = 0
    }
}

class Truck(
    type: String,
    name: String,
    override val maxPassengersCount: Int = 1,
    override var currentPassengersCount: Int = 0,
    override val maxCargoWeight: Int = 2000,
    override var currentCargoWeight: Int = 0,
    override var isEngineStarted: Boolean,
) : Car(type, name), Movable, PassengersTransportation, CargoTransportation

class Taxi(
    type: String,
    name: String,
    override val maxPassengersCount: Int = 3,
    override var currentPassengersCount: Int = 0, override var isEngineStarted: Boolean,

    ) : Car(type, name), Movable, PassengersTransportation

class Terminal(
    var countArrivedPassengers: Int = 0,
    var countDeliveredCargo: Int = 0,
) {
    fun printInformation() {
        println("Количество доставленных пассажиров: $countArrivedPassengers")
        println("Общий вес доставленных грузов $countDeliveredCargo килограмм")
    }
}

fun main() {
    val taxi = Taxi(type = "такси", "Сокол", isEngineStarted = false)
    val truck = Truck(type = "грузовик", name = "Муравей", isEngineStarted = false)
    val terminal = Terminal()
    while (taxi.currentPassengersCount < taxi.maxPassengersCount) {
        taxi.boardingPassengers(taxi.type, taxi.name)
    }
    taxi.startEngine()
    taxi.startMoving()
    taxi.unboardingPassengers(terminal)

    while (truck.currentCargoWeight < truck.maxCargoWeight) {
        truck.loadCargo(truck.type, truck.name)
    }
    truck.boardingPassengers(truck.type, truck.name)
    truck.startMoving()
    truck.startEngine()
    truck.startMoving()
    truck.unloadCargo(terminal)
    truck.unboardingPassengers(terminal)
    terminal.printInformation()

    taxi.boardingPassengers(taxi.type, taxi.name)
    taxi.boardingPassengers(taxi.type, taxi.name)
    taxi.startMoving()
    taxi.unboardingPassengers(terminal)
    terminal.printInformation()
}
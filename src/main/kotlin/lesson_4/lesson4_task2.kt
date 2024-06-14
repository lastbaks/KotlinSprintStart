package org.example.lesson_4

fun main() {
    var cargoWeight: Int = 20
    var cargoVolume: Int = 80

    println(
        "Груз с ввесом $cargoWeight килограмм " +
                "и объемом $cargoVolume литров " +
                "соответствует категории 'Average': " +
                "${(cargoWeight > 30) 
                        && (cargoWeight <= 100) 
                        and (cargoVolume < 100)}"
    )

    cargoWeight = 50
    cargoVolume = 100

    println(
        "Груз с ввесом $cargoWeight килограмм " +
                "и объемом $cargoVolume литров " +
                "соответствует категории 'Average': " +
                "${(cargoWeight > 30)
                        && (cargoWeight <= 100)
                        && (cargoVolume < 100)}"
    )

}
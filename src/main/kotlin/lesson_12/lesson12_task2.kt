package org.example.lesson_12

class WeatherDataVersion2(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var precipitation: Boolean
) {

    fun printWeatherInfo() {
        println("Температура днем: $dayTemperature градусов")
        println("Температура ночью: $nightTemperature градусов")
        if (precipitation) {
            println("Небольшой дождь")
        } else {
            println("Без осадков")
        }
    }
}

fun main() {
    val june12 = WeatherDataVersion2(
        24, 16, true
    )
    june12.printWeatherInfo()
}
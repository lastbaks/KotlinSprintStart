package org.example.lesson_12

class WeatherDataVersion4(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _precipitation: Boolean
) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var precipitation = _precipitation

    fun printWeatherInfo() {
        println("Температура днем: ${dayTemperature - 273} градусов цельсия")
        println("Температура ночью: ${nightTemperature - 273} градусов цельсия")
        if (precipitation) {
            println("Небольшой дождь")
        } else {
            println("Без осадков")
        }
    }

    init {
        printWeatherInfo()
    }
}

fun main() {
    WeatherDataVersion4(
        301, 294, true
    )
}
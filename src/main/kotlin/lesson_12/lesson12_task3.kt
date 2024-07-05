package org.example.lesson_12

class WeatherDataVersion3(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _isRainy: Boolean
) {
    var deltaFahrenheitCelsius = 273
    var dayTemperature = _dayTemperature - deltaFahrenheitCelsius
    var nightTemperature = _nightTemperature - deltaFahrenheitCelsius
    var isRainy = _isRainy

    fun printWeatherInfo() {
        println("Температура днем: ${dayTemperature} градусов цельсия")
        println("Температура ночью: ${nightTemperature} градусов цельсия")
        if (isRainy) {
            println("Небольшой дождь")
        } else {
            println("Без осадков")
        }
    }
}

fun main() {
    val june13 = WeatherDataVersion3(
        301, 294, true
    )
    june13.printWeatherInfo()
}
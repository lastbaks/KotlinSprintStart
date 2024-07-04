package org.example.lesson_12

class WeatherData {

    var dayTemperature: Int = 24
    var nightTemperature: Int = 13
    var precipitation: Boolean = false

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
    val june10 = WeatherData()
    june10.dayTemperature = 30
    june10.nightTemperature = 18
    june10.precipitation = true

    val june11 = WeatherData()
    june11.dayTemperature = 27
    june11.nightTemperature = 16
    june11.precipitation = false

    june10.printWeatherInfo()
    june11.printWeatherInfo()
}


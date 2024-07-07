package org.example.lesson_12

import kotlin.random.Random

class WeatherDataVersion5(
    _dayNumber: String,
    _dayTemperature: Int,
    _nightTemperature: Int,
    _isRainy: Boolean
) {
    var deltaFahrenheitCelsius = 273
    var dayNumber = _dayNumber
    var dayTemperature = _dayTemperature - deltaFahrenheitCelsius
    var nightTemperature = _nightTemperature - deltaFahrenheitCelsius
    var isRainy = _isRainy
}

fun main() {
    val listOfWeatherData = createDays(30, "сентябрь")
    val averageDayTemperature = (listOfWeatherData.map {it.dayTemperature}).average().toInt()
    val averageNightTemperature = (listOfWeatherData.map { it.nightTemperature }).average().toInt()
    val rainyDaysCount = listOfWeatherData.count { it.isRainy }

    println("Средняя дневная температура = $averageDayTemperature градусов цельсия.")
    println("Средняя ночная температура = $averageNightTemperature градусов цельсия.")
    println("Количество дней с осадками = $rainyDaysCount")
}


fun createDays(count: Int, month: String): List<WeatherDataVersion5> {
    val weatherData = mutableListOf<WeatherDataVersion5>()
    for (i in 1..count) {
        val dayTemperature = Random.nextInt(from = 293, until = 306)
        val nightTemperature = Random.nextInt(from = 282, until = 299)
        val isRainy = Random.nextBoolean()
        weatherData.add(WeatherDataVersion5("$i $month", dayTemperature, nightTemperature, isRainy))
    }
    return weatherData
}
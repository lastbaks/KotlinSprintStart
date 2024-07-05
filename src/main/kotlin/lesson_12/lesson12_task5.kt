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

    companion object {
        val days = mutableListOf<WeatherDataVersion5>()
        fun createDays(count: Int, month: String): List<WeatherDataVersion5> {
            for (i in 1..count) {
                val dayTemperature = Random.nextInt(from = 293, until = 306)
                val nightTemperature = Random.nextInt(from = 282, until = 299)
                val isRainy = Random.nextBoolean()
                days.add(WeatherDataVersion5("$i $month", dayTemperature, nightTemperature, isRainy))
            }
            return days
        }
    }
}

fun main() {
    val dayTemperatures = mutableListOf<Int>()
    val nightTemperatures = mutableListOf<Int>()
    var rainyDaysCount = 0
    val days = WeatherDataVersion5.createDays(30, "сентябрь")
    days.forEach {
        dayTemperatures.add(it.dayTemperature)
        nightTemperatures.add(it.nightTemperature)
        if (it.isRainy == true) {
            rainyDaysCount++
        }
    }
    println("Средняя дневная температура = ${dayTemperatures.average().toInt()} градусов цельсия.")
    println("Средняя ночная температура = ${nightTemperatures.average().toInt()} градусов цельсия.")
    println("Количество дней с осадками = $rainyDaysCount")

}
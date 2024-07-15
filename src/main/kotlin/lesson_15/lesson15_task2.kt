package org.example.lesson_15

abstract class WeatherStationStats(
    val date: String
)

class Temperature(
    date: String,
    val dayTemperature: Int,
    val nightTemperature: Int,
) : WeatherStationStats(date)

class PrecipitationAmount(
    date: String,
    val Precipitations: String
) : WeatherStationStats(date)

class WeatherServer {
    fun sendData(weatherData: WeatherStationStats) {
        when (weatherData) {
            is Temperature -> println("Дата: ${weatherData.date}. Температура днем - ${weatherData.dayTemperature} градуса, температура ночью - ${weatherData.nightTemperature}")
            is PrecipitationAmount -> println("Дата: ${weatherData.date}. ${weatherData.Precipitations}")
        }
    }
}

fun main() {
    val weatherData: MutableList<WeatherStationStats> = mutableListOf()
    weatherData.add(Temperature("12 сентября", 24, 13))
    weatherData.add(PrecipitationAmount("12 сентября", "Небольшой дождь"))
    weatherData.add(Temperature("13 сентября", 26, 18))
    weatherData.add(PrecipitationAmount("13 сентября", "Без осадков>"))

    val server = WeatherServer()
    weatherData.forEach {
        server.sendData(it)
    }
}


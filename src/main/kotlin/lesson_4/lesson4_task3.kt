package org.example.lesson_4

fun main() {
    var sunnyWeather: Boolean = true
    var openTent:Boolean = true
    var airHumidity: Int = 20
    var season: String = "зима"

    // т.к. в этой задаче в отличие от предыдущейнет требования делать сравнение непосредственно в методе println
    // - я вывел сравнение в отдельную переменную для лучшей читаемости,
    // ну и просто для проверки разных подходов к решению
    val conditionsForLegumes: Boolean = (sunnyWeather && openTent && airHumidity == 20 && season != "зима" )

    println("Благоприятные ли сейчас условия для роста бобовых? $conditionsForLegumes")
}
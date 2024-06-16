package org.example.lesson_4

const val SUITABLE_HUMIDITY: Int = 20
const val NON_SUITABLE_SEASON: String = "зима"

fun main() {
    var isSunny: Boolean = true
    var isAwningOpen:Boolean = true
    var airHumidity: Int = 20
    var season: String = "зима"

    // т.к. в этой задаче в отличие от предыдущейнет требования делать сравнение непосредственно в методе println
    // - я вывел сравнение в отдельную переменную для лучшей читаемости,
    // ну и просто для проверки разных подходов к решению
    val conditionsForLegumes: Boolean = (isSunny && isAwningOpen && airHumidity == SUITABLE_HUMIDITY && season != NON_SUITABLE_SEASON )

    println("Благоприятные ли сейчас условия для роста бобовых? $conditionsForLegumes")
}
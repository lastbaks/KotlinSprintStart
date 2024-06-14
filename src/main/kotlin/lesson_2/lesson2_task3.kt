package org.example.lesson_2

const val MINUTE_IN_HOUR: Byte = 60
const val HOURS_IN_DAY: Byte = 24

fun main() {
    val departHour: Int = 9
    val departMinute: Int = 39
    val travelTime: Int = 457

    val minutes: Int = departHour * MINUTE_IN_HOUR + departMinute + travelTime
    val arrivalHour = minutes / MINUTE_IN_HOUR % HOURS_IN_DAY
    val arrivalMinute = minutes % MINUTE_IN_HOUR
    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}
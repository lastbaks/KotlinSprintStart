package org.example.lesson_2

fun main() {
    val departHour: Int = 9
    val departMinute: Int = 39
    val travelTime: Int = 457

    val travelHours = travelTime / 60
    val travelMinutes = travelTime % 60
    val extraHour = (departMinute + travelMinutes) / 60
    val arrivalMinute = (departMinute + travelMinutes) % 60
    val arrivalHour = (departHour + travelHours + extraHour) % 24

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}
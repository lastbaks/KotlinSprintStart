package org.example.lesson_1
const val SECONDS_IN_HOUR: Short = 3600
const val SECONDS_IN_MINUTE: Byte = 60


fun main() {

    val totalSeconds: Short = 6480
    val hours: Int = totalSeconds / SECONDS_IN_HOUR
    val minutes: Int = (totalSeconds / SECONDS_IN_MINUTE) % SECONDS_IN_MINUTE
    val seconds: Int = totalSeconds % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}
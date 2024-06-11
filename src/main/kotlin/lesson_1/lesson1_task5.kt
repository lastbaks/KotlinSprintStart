package org.example.lesson_1

fun main() {
    val totalSeconds: Short = 6480
    val hours: Int = totalSeconds / 3600
    val minutes: Int = totalSeconds / 60 - (hours * 60)
    val seconds: Int = totalSeconds - ((hours * 3600) + (minutes * 60))

    //печать с помощью хардкодом добавленных нулей
    println("0$hours:$minutes:0$seconds")

    //печать с форматированием чисел в корректный формат
    val hoursString: String = (String.format("%02d",hours))
    val minutesString: String  = (String.format("%02d",minutes))
    val secondsString: String = (String.format("%02d",seconds))

    println("$hoursString:$minutesString:$secondsString")
}
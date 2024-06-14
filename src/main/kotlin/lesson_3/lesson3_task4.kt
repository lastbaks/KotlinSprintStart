package org.example.lesson_3

fun main() {
    var moveNumber: String = "1"
    var startPosition: String = "E2"
    var endPosition: String = "E4"

    //можно присвоить строку переменной
    var moveParameters: String = ("$moveNumber $startPosition - $endPosition")
    println(moveParameters)

    moveNumber = "2"
    startPosition = "B2"
    endPosition = "B3"
    // или можно сразу распечатать
    println("$moveNumber $startPosition - $endPosition")

}
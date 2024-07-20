package org.example.lesson_16

const val PI = 3.14

class Circle (
    private var radius: Int
){

    fun getCircumference() = (2 * PI * radius).toInt()

    fun getArea() = (radius * radius * PI).toInt()

}

fun main() {
    println("Введите радиус окружности")
    val circle = Circle(readln().toInt())
    println("Длина окружности = ${circle.getCircumference()}")
    println("Площадь окружности = ${circle.getArea()}")
}
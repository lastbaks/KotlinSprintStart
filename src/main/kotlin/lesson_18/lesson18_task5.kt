package org.example.lesson_18

abstract class Figure(
    var xPosition: Int,
    var yPosition: Int,
) {
    abstract fun draw()
}

class Dot(
    xPosition: Int = 0,
    yPosition: Int = 0,
) : Figure(xPosition, yPosition) {
    override fun draw() {
        println("Создана точка скоординатами $xPosition, $yPosition")
    }
}

class Square(
    xPosition: Int = 0,
    yPosition: Int = 0,
    var sideLength: Int = 0,
) : Figure(xPosition, yPosition) {
    override fun draw() {
        println("Введите длину стороны квадрата")
        sideLength = readln().toInt()
        println("Нарисован квадрат с координатами левого верхнего угла $xPosition, $yPosition, cо сторонами длиной $sideLength")
    }
}

class Circle(
    xPosition: Int = 0,
    yPosition: Int = 0,
    var radius: Int = 0,
) : Figure(xPosition, yPosition) {
    override fun draw() {
        println("Введите радиус круга")
        radius = readln().toInt()
        println("Нарисован круг с координатами центра $xPosition, $yPosition, радиусом $radius")
    }
}

class Screen(
    val dot: Dot,
    val square: Square,
    val circle: Circle
)

fun main() {
    val screen = Screen(dot = Dot(100, 100), square = Square(100, 200), circle = Circle(200, 200))
    val figures = listOf(screen.dot, screen.circle, screen.square)
    figures.forEach { it.draw() }
}
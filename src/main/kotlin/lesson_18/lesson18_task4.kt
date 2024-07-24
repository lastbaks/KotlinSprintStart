package org.example.lesson_18

abstract class Box() {
    abstract fun getSurfaceArea(): String
}

class RectangleBox(
    val length: Int,
    val width: Int,
    val height: Int,
) : Box() {
    override fun getSurfaceArea() =
        ("Площадь поверхности прямоугльной коробки равна ${length * width * height} сантиметров кубических")
}

class SquareBox(
    val edgeLength: Int,
) : Box() {
    override fun getSurfaceArea() =
        ("Площадь поверхности квадратной коробки равна ${edgeLength * edgeLength * edgeLength} сантиметров кубических")
}

fun main() {
    val rectangleBox = RectangleBox(40, 30, 20)
    val squareBox = SquareBox(30)
    val boxes = listOf(rectangleBox, squareBox)
    boxes.forEach { println(it.getSurfaceArea()) }
}
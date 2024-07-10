package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.round

const val BLACK_COLOR: String = "Черный"
const val WHITE_COLOR: String = "Белый"

abstract class Figure(

    open var color: String = BLACK_COLOR
) {
    abstract fun getArea(): Double

    abstract fun getPerimeter(): Double
}

class Circle(
    color: String, val radius: Double,
) : Figure() {
    override var color = color
    override fun getArea(): Double {
        return PI * (radius * radius)
    }

    override fun getPerimeter(): Double {
        return (PI * 2 * radius)
    }
}

class Rectangle(
    color: String, val width: Double, val height: Double
) : Figure() {
    override var color = color
    override fun getArea(): Double {
        return (width * height)
    }

    override fun getPerimeter(): Double {
        return ((width + height) * 2)
    }
}

fun main() {
    val figures = mutableListOf<Figure>()
    val circle1 = Circle(BLACK_COLOR, 20.0)
    val circle2 = Circle(WHITE_COLOR, 15.0)
    val rectangle1 = Rectangle(BLACK_COLOR, 2.0, 3.0)
    val rectangle2 = Rectangle(WHITE_COLOR, 5.0, 7.0)

    figures.add(circle1)
    figures.add(circle2)
    figures.add(rectangle1)
    figures.add(rectangle2)

    var sumOfArea = 0.0
    var sumOfPerimeter = 0.0
    figures.forEach {
        when (it.color) {
            BLACK_COLOR -> sumOfPerimeter += it.getArea()
            WHITE_COLOR -> sumOfArea += it.getPerimeter()
        }
    }
    println("Сумма периметров всех черных фигур равна ${round(sumOfPerimeter * 100) / 100}")
    println("Сумма площадей всех белых фигур равна ${round(sumOfArea * 100) / 100}")
}
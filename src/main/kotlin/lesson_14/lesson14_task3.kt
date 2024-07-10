package org.example.lesson_14

abstract class Figure(
    open var color: String = "Черный"
) {
    abstract fun getArea(): Float

    abstract fun getPerimeter(): Float
}

class Circle(color: String, val radius: Float,
) : Figure() {
    override var color = color
    override fun getArea(): Float {
        return 3.14f * (radius * radius)
    }

    override fun getPerimeter(): Float {
        return (3.14f * 2 * radius)
    }
}

class Rectangle(color: String, val width: Float, val height: Float
) : Figure() {
    override var color = color
    override fun getArea(): Float {
        return (width * height)
    }

    override fun getPerimeter(): Float {
        return ((width + height) * 2)
    }
}

fun main() {
    val figures = mutableListOf<Figure>()
    val circle1 = Circle("Черный", 20.0f)
    val circle2 = Circle("Белый", 15.0f)
    val rectangle1 = Rectangle("Черный", 2f, 3f)
    val rectangle2 = Rectangle("Белый", 5f, 7f)

    figures.add(circle1)
    figures.add(circle2)
    figures.add(rectangle1)
    figures.add(rectangle2)

    var sumOfArea: Float = 0f
    var sumOfPerimeter: Float = 0f
    figures.forEach {
        if (it.color == "Черный") {
            sumOfPerimeter += it.getArea()
        }

        if (it.color == "Белый") {
            sumOfArea += it.getPerimeter()
        }
    }
    println("Сумма периметров всех черных фигур равна $sumOfPerimeter")
    println("Сумма площадей всех белых фигур равна $sumOfArea")
}
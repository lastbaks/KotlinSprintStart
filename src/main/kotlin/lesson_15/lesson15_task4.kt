package org.example.lesson_15

interface FindComponents {
    fun findItems(product: Instruments, component: String) {
        val findItem = product.components.find { it.productName == component }
        println("Выполняю поиск компонента для инструмента ${product.productName}...")
        println("${findItem?.productName}, ${findItem?.countInStock} штук")

    }
}

abstract class Product(
    val productName: String,
    var countInStock: Int,
)

class Instruments(
    productName: String,
    countInStock: Int,
    val components: MutableList<Components> = mutableListOf()
) : Product(productName, countInStock), FindComponents

class Components(
    productName: String,
    countInStock: Int
) : Product(productName, countInStock)

fun main() {
    val product1 = Instruments("Гитара", 1)
    val component1 = Components("Каподастер", 2)
    val component2 = Components("Медиатор", 10)

    product1.components.add(component1)
    product1.components.add(component2)

    val product2 = Instruments("Барабан", 1)
    val component3 = Components("Палочки", 2)
    val component4 = Components("Пружина", 2)
    val component5 = Components("Мембрана", 2)

    product2.components.add(component3)
    product2.components.add(component4)
    product2.components.add(component5)

    product1.findItems(product1, "Медиатор")
    product2.findItems(product2, "Пружина")
}
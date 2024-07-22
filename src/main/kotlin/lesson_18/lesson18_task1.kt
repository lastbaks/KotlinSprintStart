package org.example.lesson_18

class Order2{
    fun addProduct(
        orderNumber: Int,
        item: String
    ) {
        println("Заказан товар $item")
    }

    fun addProduct(
        orderNumber: Int,
        item: List<String>
    ) {
        println("Заказаны товары $item")
    }
}

fun main() {
    val order = Order2()
    order.addProduct(1, "Кока-кола")
    order.addProduct(1, listOf("Хлеб", "Яблочный сок", "Лук"))
}
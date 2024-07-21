package org.example.lesson_16

class Order(
    val orderNumber: Int,
    private var orderStatus: String
) {

    fun getOrderStatus() = orderStatus

    private fun setOrderStatus(status: String) {
        orderStatus = status
    }

    fun changeOrderStatus(newStatus: String) {
        setOrderStatus(newStatus)
    }
}

fun main() {
    val order1 = Order(1, "Сборка")
    println("Заказ № ${order1.orderNumber}. Статус - ${order1.getOrderStatus()}.")
    order1.changeOrderStatus("Выдача курьеру")
    println("Заказ № ${order1.orderNumber}. Статус - ${order1.getOrderStatus()}.")
}
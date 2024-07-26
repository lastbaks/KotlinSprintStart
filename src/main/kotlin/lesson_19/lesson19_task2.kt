package org.example.lesson_19

enum class Category(val printName: String) {
    WEAR("Одежда"),
    STUFF("Канцелярские товары"),
    OTHER("Прочее");

    fun getName() = printName
}

class Item(
    val itemId: Int,
    val itemName: String,
    val itemCategory: Category,
) {
    fun printInformation() {
        println("Товар №$itemId: $itemName")
        println("Категория: ${itemCategory.getName()}")
        println()
    }
}

fun main() {
    var itemNumber: Int = 1
    val item1 = Item(itemNumber++, "рубашка", Category.WEAR)
    val item2 = Item(itemNumber++, "Скрепки", Category.STUFF)
    val item3 = Item(itemNumber++, "В-душу-вЛазер", Category.OTHER)

    val items = mutableListOf<Item>()
    items.add(item1)
    items.add(item2)
    items.add(item3)

    items.forEach { it.printInformation() }
}
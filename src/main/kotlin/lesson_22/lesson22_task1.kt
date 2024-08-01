package org.example.lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook("Незнайка на луне", "Николай Носов")
    val regularBook2 = RegularBook("Незнайка на луне", "Николай Носов")
    val dataBook1 = DataBook("Три мушкетера", "Александр Дюма")
    val dataBook2 = DataBook("Три мушкетера", "Александр Дюма")

    //В обычном классе сравниваются ссылки на объекты классов в памяти, поэтому возвращается False
    println(regularBook1 == regularBook2)
    //Data класс сравнивает сами данные, поэтому возвращается True
    println(dataBook1 == dataBook2)
}

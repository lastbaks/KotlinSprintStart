package org.example.lesson_22

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook2("Незнайка на луне", "Николай Носов")
    val dataBook1 = DataBook2("Три мушкетера", "Александр Дюма")

    //обычный класс передает в функцию println строковое представление объекта по умолчанию, не обращаясь отдельно к полям объекта
    println(regularBook1)

    //Data класс при выполнении функции println обращается к содержимому объекта и возвращает понятную для чтения строку.
    println(dataBook1)
}
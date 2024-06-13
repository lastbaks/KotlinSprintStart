package org.example.lesson_3

fun main() {
    val firstName: String = "Татьяна"
    var lastName: String = "Андреева"
    val surName: String = "Сергеевна"
    var age: Int = 20
    println("$lastName $firstName $surName. Полных лет: $age")
    age = 22
    lastName = "Сидорова"
    println("$lastName $firstName $surName. Полных лет: $age")
}
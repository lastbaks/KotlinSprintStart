package org.example.lesson_13

class ContactsVersion4(
    name: String,
    company: String? = null,
    phoneNumber: Long?
) {
    init {
        println("Имя: $name")
        println("Номер телефона: $phoneNumber")
        println("Компания: ${company ?: "не указано"}")
        if (company == "") {
            println(" Компания: Не указано.")
        } else {
            println("Компания: $company")
        }
    }
}

fun main() {
    addContact()
}

fun addContact() {
    println("Добавление новой записи в телефонную книгу.")
    println("Введите имя:")
    val _name = readln()
    println("Введите название компании")
    val _company = readLine()
    println("Введите номер телефона")
    val _phoneNumber = readln().toLongOrNull()
    if (_phoneNumber == null) {
        println("Не введен номер телефона")
    } else {
        val contact1 = ContactsVersion4(_name, _company, _phoneNumber)
    }


}
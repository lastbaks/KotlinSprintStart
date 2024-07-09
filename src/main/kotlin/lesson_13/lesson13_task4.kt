package org.example.lesson_13

class ContactsVersion4(
    val name: String,
    val company: String? = null,
    val phoneNumber: Long?
) {
    fun printContactInformation() {
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
    val contacts = mutableListOf<ContactsVersion4>()
    contacts.add(addContact())
    contacts.add(addContact())
    contacts.add(addContact())
    contacts.forEach { it.printContactInformation() }
}

fun addContact() : ContactsVersion4{
    println("Добавление новой записи в телефонную книгу.")
    println("Введите имя:")
    val _name = readln()
    println("Введите название компании")
    val _company = readLine()
    println("Введите номер телефона")
    var _phoneNumber = readln().toLongOrNull()
    while (_phoneNumber == null) {
        println("Не введен номер телефона")
        _phoneNumber = readln().toLongOrNull()
    }
    return ContactsVersion4(_name, _company, _phoneNumber)
}

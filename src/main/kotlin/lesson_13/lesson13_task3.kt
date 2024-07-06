package org.example.lesson_13

class ContactsVersion3(
    val id: Int,
    var name: String,
    var company: String? = null,
    var phoneNumber: Long
) {
    fun printContactInformation() {
        println(
            """
            - Имя: $name
            - Номер: $phoneNumber
            - Компания: ${company ?: "не указано"}
        """.trimIndent()
        )
    }
}

fun main() {
    val contact1 = ContactsVersion3(
        id = 1,
        name = "Джонни Депп",
        phoneNumber = 89365612482,
    )
    val contact2 = ContactsVersion3(
        id = 1,
        name = "Киллиан Мерфи",
        phoneNumber = 89365612482,
    )
    val contact3 = ContactsVersion3(
        id = 1,
        name = "Билл Найи",
        company = "null",
        phoneNumber = 89365612482,
    )
    val contact4 = ContactsVersion3(
        id = 1,
        name = "Марго Робби",
        company = "Columbia pictures",
        phoneNumber = 89365612482,
    )
    val contact5 = ContactsVersion3(
        id = 1,
        name = "Карла Гуджино",
        company = "Columbia pictures",
        phoneNumber = 89365612482,
    )

    val contactList = mutableListOf<ContactsVersion3>()
    contactList.add(contact1)
    contactList.add(contact2)
    contactList.add(contact3)
    contactList.add(contact4)
    contactList.add(contact5)

    val companyNames = contactList.distinct()
    companyNames.forEach {
        if (it.company != null) {
            println(it.company)
        }
    }

    val testList = mutableListOf("Columbia pictures", "Columbia pictures", "MGM")
    println(testList)
    val testDistinctList = testList.distinct()
    println(testDistinctList)
    val testSet = testList.toSet()
    println(testSet)
}


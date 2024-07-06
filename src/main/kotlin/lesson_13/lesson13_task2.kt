package org.example.lesson_13

class ContactsVersion2(
    val id: Int,
    val name: String,
    val company: String? = null,
    val phoneNumber: Long
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
    val contact1 = ContactsVersion2(
        id = 1,
        name = "Джонни Депп",
        phoneNumber = 89365612482,
    )
    contact1.printContactInformation()
}
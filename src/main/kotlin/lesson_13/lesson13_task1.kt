package org.example.lesson_13

class Contacts(
    val id: Int,
    val name: String,
    val company: String?,
    val phoneNumber: Long
)

fun main() {
    val contact1 = Contacts(id =1, name = "Винни пух", company = null, phoneNumber = 89365612482)
    println(contact1.company)
}
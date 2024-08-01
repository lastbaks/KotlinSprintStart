package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = listOf('а', 'о', 'у', 'и', 'е', 'ё', 'ю', 'я', 'a', 'e', 'i', 'o', 'u')
    return this.count { it in vowels }
}

fun main() {
    val stroke = "I learn kotlin"
    println(stroke.vowelCount())
}
package org.example.lesson_21

fun String.vowelCount(input: String) : Int {
    val vowels = listOf('а', 'о', 'у', 'и', 'е', 'ё', 'ю', 'я', 'a', 'e', 'i', 'o', 'u', )
    var count = 0
    for (char in input.lowercase()) {
        if (char in vowels) {
            count++
        }
    }
    return count
}

fun main() {
    val stroke = "I learn kotlin"
    println(stroke.vowelCount(stroke))
}
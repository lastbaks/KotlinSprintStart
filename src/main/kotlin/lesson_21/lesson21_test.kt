package org.example.lesson_21

import java.io.File

fun String.writeToFileAtStart(filePath: String) {
    val file = File(filePath)
    val currentContent = if (file.exists()) file.readText() else ""
    file.writeText("${this.lowercase()}\n$currentContent")
    println(file.readText())
}

fun main() {
    val filePath = "output.txt"

    "Первый текст".writeToFileAtStart(filePath)
    "Второй текст".writeToFileAtStart(filePath)
    "Третий текст".writeToFileAtStart(filePath)
}
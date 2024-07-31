package org.example.lesson_21

import java.io.File

fun main() {
    val fileName = "example.txt"
    val text1 = "Текст 1"
    val text2 = "Текст 2"
    val text3 = "Текст 3"

    text1.addTextToStartOfFile(fileName)
    text2.addTextToStartOfFile(fileName)
    text3.addTextToStartOfFile(fileName)

}

fun String.addTextToStartOfFile(fileName: String) {
    val file = File(fileName)
    val currentText = if (file.exists()) file.readText() else ""
    file.writeText("${this.lowercase()}, $currentText")
    println(file.readText())
}


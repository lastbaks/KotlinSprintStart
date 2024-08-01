package org.example.lesson_21

import java.io.File

fun main() {
    val textFile = File("example.txt")
    textFile.addTextToStartOfFile("текст 1")
    textFile.addTextToStartOfFile("текст 2")
    textFile.addTextToStartOfFile("текст 3")
}

fun File.addTextToStartOfFile(newText: String) {
    val currentText = if (exists()) readText() else ""
    writeText("${newText.lowercase()}, $currentText")
    println(readText())
}
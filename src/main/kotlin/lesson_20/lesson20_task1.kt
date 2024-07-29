package org.example.lesson_20

fun main() {
    val userName= "Элтон Джон"
    val greetings: () -> String = fun(): String = "C наступающим новым годом, $userName!"
    println(greetings())
}
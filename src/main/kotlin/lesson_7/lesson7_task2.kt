package org.example.lesson_7

import kotlin.random.Random
const val MIN_VALUE = 1000
const val MAX_VALUE = 10000
fun main() {
    var generatedCode = 0
    var inputCode = 1
    while(inputCode != generatedCode) {
        generatedCode = Random.nextInt(from = MIN_VALUE, until = MAX_VALUE)
        println("Ваш код авторизации: N$generatedCode")
        println("Введите код из СМС")
        inputCode = readln().toInt()
    }
    println("Добро пожаловать")
}
package org.example.lesson_4

fun main() {
    var isDamaged = false
    var crewCount: Int
    var provisionCount: Int
    var isGoodWeather = true
    var input: String
    var readyToDepart: Boolean = false
    println("Корабль имеет повреждения? да/нет")

    input = readln()
    if (input == "да") {
        isDamaged = true
    } else if (input == "нет") {
        isDamaged = false
    } else {
        println("Неверные данны. Инициируйте ввода данных снова")
    }

    println("Введите количество членов экипажа")
    crewCount = readln().toInt()

    println("Введите количество ящиков с провизией")
    provisionCount = readln().toInt()

    println("Погода хорошая? да/нет")

    input = readln()
    if (input == "да") {
        isGoodWeather = true
    } else if (input == "нет") {
        isGoodWeather = false
    } else {
        println("Неверные данны. Инициируйте ввода данных снова")
    }

    if (((!isDamaged) && (crewCount >= 55) && (crewCount<= 70) && (provisionCount > 50) && (isGoodWeather)) ||
            ((crewCount == 70) && (provisionCount > 50) && (isGoodWeather))) {
        readyToDepart = true
    }
    if(readyToDepart) {
        println("Условия соблюдены, можно отправляться в плаванье")
    } else {
        println("Условия не соблюдены, отплытие не разрешено")
    }
}
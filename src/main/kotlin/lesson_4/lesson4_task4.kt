package org.example.lesson_4

fun main() {
    var trainingDay: Int = 8
    var isEven: Boolean = trainingDay % 2 == 0
    val message: String = """ 
        |Упражнения для рук:    $isEven
        |Упражнения для ног:     ${!isEven}
        |Упражнения для спины:   ${!isEven}
        |Упражнения для пресса: $isEven
    """.trimMargin()

    println(message)

}
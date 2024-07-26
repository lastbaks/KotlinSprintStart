package org.example.lesson_19

const val START_POPULATION = 5

class Human(
    val name: String,
    val sex: Sex,
) {
    companion object {
        val humans = mutableListOf<Human>()

        fun createHumans(count: Int): List<Human> {
            println("Инструкция по созданию человечества.")
            println("Вам нужно создать пятырых людей, которые заселят землю")
            println("Вам достаточно корректно указать два параметра для каждого человека:")
            println("Имя - оно может быть любым, и пол - Мужской или Женский.")
            println()
            for (i in 1..count) {
                println("Создание человека №$i")
                println("Введите имя - любое, какое вам нравится")
                val name = readln()
                println("Теперь введите пол: MALE или FEMALE")
                val sex = readln()
                humans.add(Human(name, Sex.valueOf(sex)))
            }
            return humans
        }
    }
}

enum class Sex(val printValue: String) {
    MALE("Мужчина"),
    FEMALE("Женщина"),
}

fun main() {
    val humanity = Human.createHumans(START_POPULATION)
    humanity.forEach {
        println("${it.name} - ${it.sex.printValue}")
    }
}

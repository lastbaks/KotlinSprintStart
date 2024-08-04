package org.example.lesson_22

data class CrewMember(
    val name: String,
    val age: Int,
    val prophecy: String,
)

fun main() {

    val crewMember = CrewMember("Джон Сильвер", 50, "Боцман")
    val (name, age, prophecy) = crewMember
    println(name)
    println(age)
    println(prophecy)
}
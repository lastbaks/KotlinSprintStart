package org.example.lesson_22

data class GalacticGuide(
    val nameofPlaceOrEvent: String,
    val descriptionOrPlaceOrEvent: String,
    val dateOfPlaceOrEvent : String,
    val distanceFromEarthInLightYears: Int,
)

fun main() {
    val place1 = GalacticGuide("Alpha Centauri",
        "Ближайшая звезда от земного солнца",
        "01.24.2234",
        4 ,
    )

    val name = place1.component1()
    val description = place1.component2()
    val date = place1.component3()
    val distance = place1.component4()
    println("$name, $description. Расстояние от земли $distance световых года. Дата внесения в список звезд - транспортиров: $date ")
}
package org.example.lesson_15

abstract class Fish :  Swimming {

}

abstract class Bird : FLying, Swimming {

}

class  Carp : Fish() {
    override fun beginSwimming() {
        println("Карп плывет")
    }
}

class Duck() : Bird() {
    override fun prepareToFly() {
        println("Утка выбирает направление, в котором есть место для разгона, " +
                "взмахами крыльев приподниматся над поверностью и начинает разгон, чтобы набрать подъемную силу")
    }

    override fun prepareToLanding() {
        println("Утка снижается и по касательной садится на воду")
    }

    override fun beginSwimming() {
        println("Утка плывет")
    }
}

class Gull() : Bird() {
    override fun prepareToFly() {
        println("Чайка взмахивает крыльями и отрывается от поверхности")
    }

    override fun prepareToLanding() {
        println("Чайка снижается, и садится")
    }

    override fun beginSwimming() {
        println("чайка плывет")
    }

}

interface Swimming {

    fun beginSwimming()

}

interface FLying {

    fun prepareToFly()
    fun prepareToLanding()

}

fun main() {
    val carp = Carp()
    val duck = Duck()
    val gull = Gull()

    carp.beginSwimming()
    duck.prepareToFly()
    duck.prepareToLanding()
    duck.beginSwimming()
    gull.prepareToFly()
    gull.prepareToLanding()
    gull.beginSwimming()
}
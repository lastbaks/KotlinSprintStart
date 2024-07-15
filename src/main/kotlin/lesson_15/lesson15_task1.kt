package org.example.lesson_15

class  Carp():Swimming  {
    override fun beginSwimming() {
        println("Кари плавает с помощью плавников, скользя в воде. Чешуя помогает увеличивать скорость")
    }

}

class Duck() : FLying, Swimming {
    override fun beginFlying() {
        println("У утки тяжелое тело, длинная шея, поэтому для полета она обычно набирает скорость и взлетает в основном с воды")
    }

    override fun beginSwimming() {
        println("Утка максимально приспособлена к плаванию. благодаря строению тела может находиться в ледяной воде неограниченно долго и плавать даже во сне.")
    }

}

class Gull : FLying, Swimming {
    override fun beginFlying() {
        println("Чайка имеет легкое тело, большие крылья, что позволяет легко маневрировать в полете и менять траекторию для лова рыбы")
    }

    override fun beginSwimming() {
        println("Чайка может как держаться на воде, так и нкрыть")
    }

}

interface Swimming {

    fun beginSwimming()

}

interface FLying {

    fun beginFlying()

}

fun main() {
    val animal1 = Duck()
    val animal2 = Gull()
    val animal3 = Carp()

    animal1.beginFlying()
    animal1.beginSwimming()

    animal2.beginFlying()
    animal2.beginSwimming()

    animal3.beginSwimming()
}
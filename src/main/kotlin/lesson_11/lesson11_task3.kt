package org.example.lesson_11

import java.awt.Image

fun main() {

    val animeRoom = Room(
        id = 1,
        title = "Разговоры о Аниме",
        titleImage = "картинка из зарисовок Хидео Кодзимы",
        users = mutableListOf()
    )

    val user1 = User(
        id = 1,
        name = "Busya",
        password = "busya2024"
    )

    val user2 = User(
        id = 2,
        name = "Volkodav",
        password = "14121995"
    )

    println(animeRoom.title)
    animeRoom.addUser(user1)
    animeRoom.addUser(user2)
    animeRoom.users.forEach {
        println(it.name)
        println(it.status)
    }
    animeRoom.changeStatus("Volkodav", "разговаривает")
    animeRoom.changeStatus("Busya", "пользователь заглушен")
    animeRoom.users.forEach {
        println(it.name)
        println(it.status)
    }

}

class Room(
    val id: Int,
    val title: String,
    val titleImage: String,
    var users: MutableList<User>
) {
    fun addUser(userName: User) {
        users.add(userName)
    }

    fun changeStatus(name: String, newStatus: String) {
        users.forEach {
            if (it.name == name) {
                it.status = newStatus
            }
        }
    }
}

class User(
    val id: Int,
    val name: String,
    var password: String,
    var status: String = "Микрофон выключен",
    var avatar: Image? = null
)
package org.example.lesson_15

abstract class ForumMember(
    val memberId: Int,
    val memberName: String,
) {
    fun readMessages() {
        println("перейти на экран с сообщениями формума")
    }

    fun writeMessage() {
        println("открыть окно ввода сообщения")
    }
}

interface AdminRoots {

    fun deleteMessage() {
        println("Удаление сообщения")
    }

    fun deleteMember() {
        println("Удаление пользователя")
    }

}

class ForumUser(
    memberId: Int,
    memberName: String,

    ) : ForumMember(memberId, memberName)

class ForumAdmin(
    memberId: Int,
    memberName: String
) : ForumMember(memberId, memberName), AdminRoots {

}

fun main() {
    val user1 = ForumUser(0, "Коля")
    val user2 = ForumAdmin(1, "Вася")
    user1.readMessages()
    user1.writeMessage()
    user2.readMessages()
    user2.writeMessage()
    user2.deleteMessage()
    user2.deleteMember()
}

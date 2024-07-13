package org.example.lesson_11

class Forum(
    val members: MutableList<ForumMember> = mutableListOf(),
    val messages: MutableList<ForumMessage> = mutableListOf(),
    var nextUserId: Int = 1
) {
    fun addMember(userName: String): ForumMember {
        val newUser = ForumMember(nextUserId++, userName)
        members.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, messageText: String) {
        val newMessage = ForumMessage(userId, messageText)
        messages.add(newMessage)
    }

    fun printThread() {
        messages.forEach {
            val author = findAuthorById(it.authorId)?.userName ?: "Автор не найден"
            val message = it.message
            println("$author: $message")
        }
    }

    private fun findAuthorById(userId: Int) : ForumMember? {
        return  members.firstOrNull { it.userId == userId }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

fun main() {
    val kotlinLearningForum = Forum()
    val user1 = kotlinLearningForum.addMember("Константин Леман")
    val user2 = kotlinLearningForum.addMember("Александр Кочетков")

    kotlinLearningForum.createNewMessage(user1.userId, "Люди, кто знает, как взять рандомную дату из определенного года?")
    kotlinLearningForum.createNewMessage(user1.userId, "На ютубе ИЕВетров выложил новый ролик по классам - советую!")
    kotlinLearningForum.createNewMessage(user2.userId, "Не запускается Android studio. Па-ма-ги-ти!")
    kotlinLearningForum.createNewMessage(user2.userId, "Вопрос снимается, у меня просто был забит хард.")
    kotlinLearningForum.printThread()
}
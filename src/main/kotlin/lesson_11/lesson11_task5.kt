package org.example.lesson_11

class Forum(
    val member: MutableList<ForumMember> = mutableListOf(),
    val message: MutableList<ForumMessage> = mutableListOf(),
) {
    fun addMember(userName: String): ForumMember {
        val newUser = ForumMember(member.size, userName)
        member.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, messageText: String) {
        val newMessage = ForumMessage(userId, messageText)
        message.add(newMessage)
    }

    fun printThread() {
        message.forEach {
            val author = member[it.authorId].userName
            val message = it.message
            println("$author: $message")
        }
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
    kotlinLearningForum.addMember("Константин Леман")
    kotlinLearningForum.addMember("Александр Кочетков")

    kotlinLearningForum.createNewMessage(0, "Люди, кто знает, как взять рандомную дату из определенного года?")
    kotlinLearningForum.createNewMessage(0, "На ютубе ИЕВетров выложил новый ролик по классам - советую!")
    kotlinLearningForum.createNewMessage(1, "Не запускается Android studio. Па-ма-ги-ти!")
    kotlinLearningForum.createNewMessage(1, "Вопрос снимается, у меня просто был забит хард.")

    kotlinLearningForum.printThread()

}
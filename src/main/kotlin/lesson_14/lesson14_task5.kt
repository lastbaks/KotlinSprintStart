package org.example.lesson_14

class Author(
    val id: Int,
    val nickName: String
)

open class Message(
    val id: Int,
    val messageText: String,
    val author: Author,
) {
    override fun toString() = "${author.nickName}: ${messageText}"
}

class ChildMessage(
    val parentMessageId: Int,
    id: Int,
    messageText: String,
    author: Author,
) : Message(id, messageText, author)

class Chat{
    val messagesList: MutableList<Message> = mutableListOf()
    val childMessagesList: MutableList<ChildMessage> = mutableListOf()
    var messageId: Int = 0

    fun addMessage(text: String, author: Author) {
        messagesList.add(Message(messageId++, text, author))
    }

    fun addThreadMessage(text: String, author: Author, parentMessageId: Int) {
        childMessagesList.add(ChildMessage(parentMessageId, messageId++, text, author))
    }

    fun printChat() {
        val groupedChildMessages = childMessagesList.groupBy { it.parentMessageId }
        messagesList.forEach { parentMessage ->
            println(parentMessage.toString())
            groupedChildMessages[parentMessage.id]?.forEach { childMessage ->
                println("    $childMessage")
            }
        }
    }
}

fun main() {
    val author1 = Author(1, "Иван")
    val author2 = Author(2, "Коля")
    val chat = Chat()
    chat.addMessage("Как дела", author1)
    chat.addMessage("Играем в настолки?", author2)
    chat.addThreadMessage("Хорошо", author2, chat.messagesList[0].id)
    chat.printChat()
}
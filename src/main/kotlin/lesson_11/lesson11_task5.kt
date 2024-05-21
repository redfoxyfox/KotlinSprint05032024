package lesson_11

/*Задача 5* к Уроку 11

Реализовать класс работы форума (Forum). Для реализации создай дополнительные классы для сущностей “Член форума”
(с полями userId и userName) и “Сообщение форума” (с полями authorId и message).

Примени паттерн “Фабрика” для создания пользователей и сообщений форума. Напрямую объекты не создаются, логика должна
быть инкапсулирована внутри методов класса.

- createNewUser() создает новых пользователей, принимая имя пользователя. Метод сохраняет нового пользователя в общий
список и одновременно возвращает новый объект. Генерация id-шников новых пользователей происходит внутри;
- createNewMessage() создает сообщения, принимая id пользователя. Сообщения создаются только если такой пользователь
есть на форуме;
- printThread() печатает в консоль все сообщения добавленные на форум в формате:

    автор: сообщение
    автор: сообщение

Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два сообщения от каждого пользователя.*/

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

object Factory {
    private var id = 1

    fun createNewUser(userName: String): ForumMember {
        val forumMember = ForumMember(id, userName)
        id++
        return forumMember
    }

    fun createNewMessage(authorId: Int): ForumMessage {
        val arrayText = arrayOf("Текст №1", "Текст №2", "Текст №3", "Текст №4", "Текст №5")
        val message = arrayText.random()

        return ForumMessage(authorId, message)
    }
}

class Forum(
    private val listMembers: MutableList<ForumMember> = mutableListOf(),
    private val listMessages: MutableList<ForumMessage> = mutableListOf(),
) {
    fun addNewUser(userName: String) {
        val newUser = Factory.createNewUser(userName)
        listMembers.add(newUser)
    }

    fun addNewMessage(authorId: Int) {
        for (i in listMembers) {
            if (i.userId == authorId)
                listMessages.add(Factory.createNewMessage(authorId))
        }
    }

    fun printThread() {

        /*for (i in 0..<listMessages.size) {
            val name = listMessages[i].authorId
            for (j in 0..<listMembers.size) {
                if (listMembers[j].userId == name) {
                    println("${listMembers[j].userName} : ${listMessages[i].message}")
                }
            }
        }*/
        val messagesGroupedByAuthor = listMessages.groupBy { it.authorId }
        messagesGroupedByAuthor.forEach { (authorId, messages) ->
            val authorName = listMembers.find { it.userId == authorId }?.userName ?: "Unknown"
            messages.forEach { msg ->
                println("$authorName: ${msg.message}")
            }
        }
    }
}

fun main() {

    val forum1 = Forum()

    forum1.addNewUser("Вася")
    forum1.addNewUser("Петя")

    forum1.addNewMessage(1)
    forum1.addNewMessage(1)
    forum1.addNewMessage(2)
    forum1.addNewMessage(2)

    forum1.printThread()
}

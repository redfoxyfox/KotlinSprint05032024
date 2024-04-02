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
    fun createNewUser(userName: String): ForumMember {
        val id = (0..10).random()
        return ForumMember(id, userName)
    }

    fun createNewMessage(authorId: Int): ForumMessage {
        val arrayText = arrayOf("Текст №1", "Текст №2", "Текст №3", "Текст №4", "Текст №5")
        val message = arrayText.random()

        return ForumMessage(authorId, message)
    }
}

class Forum(
    val listMembers: MutableList<ForumMember> = mutableListOf(),
    val listMessages: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser1(userName: String) {
        val newUser = Factory.createNewUser(userName)
        listMembers.add(newUser)
    }

    fun createNewMessage1(authorId: Int) {
        for (i in listMembers) {
            if (i.userId == authorId)
                listMessages.add(Factory.createNewMessage(authorId))
        }
    }

    fun printThread() {

        for (i in 0..<listMessages.size) {
            val name = listMessages[i].authorId
            for (j in 0..<listMembers.size) {
                if (listMembers[j].userId == name) {
                    println("${listMembers[j].userName} : ${listMessages[i].message}")
                }
            }
        }
    }
}

fun main() {

    val forum1 = Forum()

    forum1.createNewUser1("Вася")
    forum1.createNewUser1("Петя")

    forum1.createNewMessage1(1)
    forum1.createNewMessage1(1)
    forum1.createNewMessage1(3)
    forum1.createNewMessage1(3)

    forum1.printThread()
}
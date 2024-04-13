package lesson_14

/*Задача 5* к Уроку 14

Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord. Класс должен иметь следующие методы:

- addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;
- addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения), дополнительно
принимает на вход parentMessageId для идентификации сообщения, под которым создается ветка обсуждения;

Сообщения чата должны храниться в списке, в классе Chat. Для создания сообщений соответствующих типов используй классы
Message и ChildMessage в соответствующей иерархии. У каждого типа сообщения должен быть id.

- printChat() — печатает все сообщения чата. Если создано дочернее сообщение, необходимо применить для вывода табуляцию
и печатать его под родительским сообщением. Используй groupBy() для группировки сообщений по parentMessageId, если
сообщение является экземпляром ChildMessage, или по id если это обычное сообщение.*/

open class Message(
    val id: Int,
    val parentMessageId: Int? = null,
    val author: String,
    val message: String,
)

class ChildMessage(
    id: Int,
    parentMessageId: Int,
    author: String,
    message: String,
) : Message(id, parentMessageId, author, message)

class Chat(
    val listMessages: MutableList<Message> = mutableListOf(),
) {
    var id = 0

    fun addMessage(message: String, author: String) {
        id++
        listMessages.add(Message(id, null, author, message))
    }

    fun addThreadMessage(parentMessageId: Int, author: String, message: String) {
        id++
        listMessages.add(ChildMessage(id, parentMessageId, author, message))
    }
}

fun printChat(listMessages: MutableList<Message>) {

    listMessages.forEach {
        if (it.parentMessageId == null) println("${it.id} ${it.author}: ${it.message}")

        for (i in listMessages.groupBy { it.parentMessageId })
            if (i.key == it.id) {
                for (j in 0..<i.value.size) println("\t${i.value[j].id} ${i.value[j].author}: ${i.value[j].message}")
            }
    }

}

fun main() {

    val chat = Chat()
    chat.addMessage("Всем чмоки в этом чатике", "Вася")
    chat.addMessage("Кто я? Зачем это всё?", "Петя")
    chat.addThreadMessage(1, "И тебе чмоки", "Лена")
    chat.addThreadMessage(2, "Ты — Петя!", "Саша")
    chat.addThreadMessage(1, "ЧМОК", "Юля")

    printChat(chat.listMessages)

}



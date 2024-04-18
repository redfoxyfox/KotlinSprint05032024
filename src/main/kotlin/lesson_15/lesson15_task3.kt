package lesson_15

/*Задача 3 к Уроку 15

На форуме есть два типа пользователей – обычные пользователи и администраторы.

Пользователи могут читать форум и писать сообщения. Администраторы дополнительно могут удалять сообщения и пользователей.

Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс. У абстрактного класса
должны быть соответствующие общие поля и методы. Действия на форуме отобрази сообщениями в консоль*/

abstract class ForumParticipant {
    abstract val nameUser: String
    abstract val password: Int

    abstract fun writeMessages()
    abstract fun readForum()
}

class User(
    override val nameUser: String,
    override val password: Int,
) : ForumParticipant() {

    override fun writeMessages() {
        println("Пользователь $nameUser написал сообщение")
    }

    override fun readForum() {
        println("Пользователь $nameUser читает форум")
    }

}

class Administrator(
    override val nameUser: String,
    override val password: Int,
) : ForumParticipant() {

    override fun writeMessages() {
        println("Администратор $nameUser написал сообщение")
    }

    override fun readForum() {
        println("Администратор $nameUser читает форум")
    }

    fun deleteMessages() {
        "Администратор $nameUser удалил сообщение"
    }

    fun deleteUser() {
        "Администратор $nameUser удалил пользователя"
    }

}

fun main() {


}



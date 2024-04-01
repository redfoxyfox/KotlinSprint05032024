package lesson_11

/*Задача 3 к Уроку 11

Прокачиваем абстрактное мышление. Задача на проектирование сущностей для упрощенной версии приложения социальной сети,
в которой общаются только голосом. Требуется описать сущности и имитировать действия методами.

Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты” для общения по интересам.
В карточке “комнаты” отображается:

- обложка;
- название;
- список участников — отображаются в виде аватарок. При долгом нажатии на аватар подсветится его никнейм. Рядом с
аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего: “разговаривает”, “микрофон выключен”,
“пользователь заглушен”.

Класс должен содержать методы:

– добавления участника (принимает объект участника и сохраняет в свойство комнаты);
– обновления статуса (принимает имя пользователя и новый статус);
– вывода информации о пользователе при долгом нажатии на аватар.

После проектирования создай объект комнаты с произвольными данными.*/

class Room(
    val cover: Int,
    val name: String,
    val listUsers: MutableList<User3> = mutableListOf(),
) {
    fun addUser(user: User3) {
        listUsers.add(user)
    }

    fun statusUpdate(nickname: String, status: String) {
        for (i in 0..<listUsers.size) {
            if (nickname == listUsers[i].nickname) {
                listUsers[i].status = status
            }
        }
    }

    fun outputInformation(userpic: Int) {

        for (i in 0..<listUsers.size) {
            if (userpic == listUsers[i].userpic) {
                println(listUsers[i].userpic)
                println(listUsers[i].nickname)
                println(listUsers[i].status)
            }
        }
    }


}

class User3(
    val userpic: Int,
    val nickname: String,
    var status: String = "",
)

const val IS_TALKING = "разговаривает"
const val IS_MICROPHONE_TURNED_OFF = "микрофон выключен"
const val IS_MUTED = "пользователь заглушен"

fun main() {

    val user1 = User3(1, "Вася")
    val user2 = User3(2, "Петя")
    val room1 = Room(10, "Комната 1")

    // Добавляем в комнату участников
    room1.addUser(user1)
    room1.addUser(user2)

    // Показываем какие в комнате участники
    for (i in 0..<room1.listUsers.size) {
        println(room1.listUsers[i].nickname)
    }

    // Обновляем статус участника Васи
    room1.statusUpdate("Вася", IS_TALKING)

    // Нажимаем на аватар участника
    room1.outputInformation(1)

}
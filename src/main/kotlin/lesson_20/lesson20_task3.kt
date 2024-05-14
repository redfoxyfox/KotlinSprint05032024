package lesson_20

/*
Задача 3 к Уроку 20

В игре есть запертая дверь. Игрок должен найти ключ. Нужно написать лямбда-функцию, которая будет проверять, есть
ли у игрока ключ. Если ключ есть, нужно вывести сообщение, что игрок дверь открыл, иначе – что дверь заперта.

Для проверки работы функции нужно написать класс игрока, в котором будет храниться информация о наличии ключа.*/

class UserInRoom(
    val nameuser: String,
    var isKeyThere: Boolean,
)

fun main() {

    val userInRoom1 = UserInRoom("Эдуард", true)

    val checkingForKey = { it: UserInRoom ->
        if (it.isKeyThere) println("${it.nameuser} дверь открыл")
        else println("Дверь заперта")
    }

    checkingForKey(userInRoom1)

}
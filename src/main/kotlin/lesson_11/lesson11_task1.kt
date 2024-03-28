package lesson_11

/*Задача 1 к Уроку 11
Создай класс, который будет хранить данные пользователя. В свойствах должна храниться информация об уникальном
идентификаторе, логине, пароле и почте. Названием может быть, например, User. Создай два экземпляра класса с
произвольными данными и выведи в консоль содержимое их полей.*/

fun main() {

    val user1 = User(
        id = 1,
        login = "Cici",
        password = "qwerty123",
        email = "cicicapwell@gmail.com"
    )

    val user2 = User(
        id = 2,
        login = "Kelly",
        password = "qwerty456",
        email = "kellycapwell@gmail.com"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}
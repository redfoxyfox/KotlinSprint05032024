package lesson_11

/*Задача 2 к Уроку 11

Скопируй класс User из первой задачи и назови User2. Добавь к классу новое необязательное свойство bio и несколько методов:

- вывод информации о пользователе в консоль;
- считывание из консоли текста и запись в поле bio;
- изменение пароля — сначала запросить текущий пароль, и, если он введен верно, запросить новый. Записать его в поле
и сообщить, что пароль изменен;

Далее создай объект, заполни информацию “о себе” и замени пароль. В конце выведи обновленную информацию о пользователе.*/

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun outputInformation() {
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun addBio() {
        println("Напишите биографию")
        bio = readln()
    }

    fun changePassword() {
        println("Введите старый пароль")
        val oldPassword = readln()
        if (oldPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Пароль изменён")
        } else println("Неправильно. Вы кто такие?")
    }
}

fun main() {

    val user1 = User2(
        id = 1,
        login = "Cici",
        password = "qwerty123",
        email = "cicicapwell@gmail.com",
    )

    user1.addBio()
    user1.changePassword()
    user1.outputInformation()

}
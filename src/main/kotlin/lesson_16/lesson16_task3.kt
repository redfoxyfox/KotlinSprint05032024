package lesson_16

/*
Задача 3 к Уроку 16

Создай класс, описывающий пользователя, который хранит поля логин и пароль.

Пароль не должен быть виден в теле главной функции, но должен быть способ проверить, что пароль введен верно.
Функция валидации должна принимать строку и возвращать результат проверки (и только его – без распечатки или
генерации других строк).

Выведи информацию о релевантности пароля в консоль.*/

class User(
    val loginUser: String,
    private val passwordUser: String,
) {

    fun checkPassword(passwordUser: String): Boolean {
        return passwordUser == this.passwordUser
    }

}

fun main() {

    println(User("Bob", "12345parol").checkPassword("12345parol"))

}
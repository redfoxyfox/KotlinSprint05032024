package lesson_17

/*Задача 5* к Уроку 17

Класс описывает пользователя и хранит свойства логин и пароль (без инициализации по умолчанию).

- при попытке изменить пароль, в консоль должно выводиться «Вы не можете изменить пароль».
- при попытке прочитать пароль – вместо букв должны отображаться звездочки (по количеству символов пароля).
- при изменении логина в консоли должно печататься сообщение об успешной смене логина.

Создай пользователя с произвольными данными и протестируй изменение логина и пароля. Вся реализация должна быть на
сеттерах и геттерах.*/

class User(
    private val _login: String,
    private var _password: String,
) {
    var login: String = _login
        set(value) {
            println("Пароль успешно изменён")
            field = value
        }

    var password: String = _password
        get() {
            val asterisk = ""
            println(asterisk.padStart(_password.length, '*'))
            return _password
        }
        set(value) {
            if (value != this._password) println("Вы не можете изменить пароль")
            field = _password
        }
}

fun main() {

    val user1 = User("Чебуратор", "qwerty123")

    user1.password = "asd"
    user1.password
    user1.login = "Репликант"
    println(user1.login)

}
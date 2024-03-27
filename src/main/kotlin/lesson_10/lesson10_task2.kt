package lesson_10

/*Задача 2 к Уроку 10

Для регистрации в приложении пользователь придумывает логин и пароль. И логин, и пароль должны содержать в себе хотя
бы 4 символа. Если всё верно, программа выводит приветственное сообщение.

- считывай логин и пароль с консоли поочередно;
- вынеси в отдельную функцию валидацию длины введенных данных;
- если логин или пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".*/

fun main() {

    println("Введит логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()

    if (!checkLength(userLogin, userPassword)) println("Логин или пароль недостаточно длинные")

}

fun checkLength(userLogin: String, userPassword: String): Boolean {
    return !(userLogin.count() < 4 || userPassword.count() < 4)
}
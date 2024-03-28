package lesson_1_10.lesson_6

/*Задача 1 к Уроку 6

На этапе авторизации в приложении пользователь, не имея аккаунта, выбрал регистрацию. Нужно создать блок программы,
который сначала предлагает создать логин и пароль, затем запрашивает их, чтобы войти в приложение.

Если логин или пароль введены неверно – данные запрашиваются заново. Если данные верны, выводится сообщение –
“Авторизация прошла успешно”.*/

fun main() {

    var userLogin: String
    var userPassword: String

    println("Пройдите регистрацию")
    println("Придумайте логин: ")
    val registeredUserLogin = readln()
    println("Придумайте пароль: ")
    val registeredUserPassword = readln()

    do {
        println("Для входа введите логин: ")
        userLogin = readln()
        println("Для входа введите пароль: ")
        userPassword = readln()
        println()
    } while (userLogin != registeredUserLogin || userPassword != registeredUserPassword)

    println("Авторизация прошла успешно")

}
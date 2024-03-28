package lesson_10

/*Задача 5* к Уроку 10

Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.

Метод авторизации принимает логин и пароль, верифицирует пользователя, генерирует и возвращает токен доступа.
При неудачной авторизации возвращается null. Токен - текстовая строка, генерируемая методом авторизации
(32 символа, которые включают цифры и буквы англ. алфавита). Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token

Метод получения корзины принимает токен и возвращает список товаров (содержимое переменной корзины).

Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации.
Переменные логин, пароль и корзина проинициализированы заранее и неизменяемы.*/

fun main() {

    val login = "Barbara"
    val password = "qwerty123"

    println("Ведите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()

    val token = makeToken(login, password, userLogin, userPassword)
    if (makeToken(login, password, userLogin, userPassword) == null) println("Авторизация неудачная")
    else println(returnItemsToCart(token))
}

fun makeToken(login: String, password: String, userLogin: String, userPassword: String): String? {
    return if (userLogin == login && userPassword == password) {
        val rangeNumbers = 0..9
        val rangeLetters = 'a'..'z'
        val listRange =
            rangeNumbers.toList().plus(rangeLetters.toList()) // из диапазонов делаем списки и соединяем в один
        var token = ""

        for (i in 1..32) {
            token += listRange.random()
        }
        token
    } else null
}

fun returnItemsToCart(token: String?): List<String> = listOf("Молоко", "Сахар", "Хлеб")

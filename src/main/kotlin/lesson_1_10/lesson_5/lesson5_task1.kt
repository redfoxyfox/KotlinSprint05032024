package lesson_1_10.lesson_5

/*Задача 1 к Уроку 5

Нужно написать часть модуля для авторизации пользователя. Для входа в приложение пользователь должен доказать,
что он не бот. Для этого программа предлагает решить простой математический пример – сложить два числа
(сообщить об этом пользователю).

Имитируй эти действия в консоли, путем считывания данных с клавиатуры. При успешном решении вход в программу
символизируется сообщением "Добро пожаловать!". В противном случае вывести сообщение "Доступ запрещен."*/

fun main() {

    val messageGreeting = "Подтвердите, что вы не бот. Сложите 2 числа:"
    val number1 = 5
    val number2 = 3
    val example = "$number1 + $number2 = "
    val checkSuccessful = "Добро пожаловать!"
    val checkFailed = "Доступ запрещен."

    println(messageGreeting)
    print(example)

    val result = readln().toInt()

    if (result == number1 + number2)
        println(checkSuccessful)
    else println(checkFailed)

}
package lesson_13

/*Задача 2 к Уроку 13

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.

Дополни класс методом, который будет печатать информацию о контакте сообщением в одном println() и без использования
многострочного ввода такого типа (пример):

- Имя: Ростислав
- Номер: 89123456789
- Компания: Reddit

Вместо null значения, в консоль должна выводиться строка <не указано>.*/

class SubscriberBook(
    val name: String,
    val number: Long,
    var company: String? = null,
) {

    fun printSubscriber() {
        company = company ?: "не указано"

        println("- Имя: $name \n- Номер: $number \n- Компания: $company")
    }

}

fun main() {

    val subscriber = SubscriberBook("Вася", 5555662555)
    subscriber.printSubscriber()

}
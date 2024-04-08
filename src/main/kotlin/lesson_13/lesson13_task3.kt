package lesson_13

/*Задача 3 к Уроку 13

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.

- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
- 2 контакта должны принимать null для поля компании;
- 1 контакт должен иметь название компании “null”;
- выведи список всех существующих компаний, которые есть в телефонной книге.*/

class SubscriberPhonebook(
    val name: String,
    val number: Long,
    var company: String?,
)

fun main() {

    val subscriber1 = SubscriberPhonebook("Вася", 5555662555, "null")
    val subscriber2 = SubscriberPhonebook("Петя", 3221178827, "OOO Зеленоглазое такси")
    val subscriber3 = SubscriberPhonebook("Коля", 1182757885, "OOO детка")
    val subscriber4 = SubscriberPhonebook("Дима", 7581854128, null)
    val subscriber5 = SubscriberPhonebook("Саша", 4288171841, null)

    val listSubscribers = listOf(subscriber1, subscriber2, subscriber3, subscriber4, subscriber5)

    for (i in listSubscribers) {
        if (i.company != null) println(i.company)
    }

}
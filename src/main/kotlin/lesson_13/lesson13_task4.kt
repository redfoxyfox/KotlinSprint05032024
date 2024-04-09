package lesson_13

/*Задача 4 к Уроку 13

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Программа должна заполнять контакты в телефонную книгу (отдельный список объектов).

- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя и такая запись не должна добавляться;
- для приведения введенного номера к числу используй toLongOrNull();
- если пользователь не заполнил компанию, то в объект записывать null.

Выведи созданные объекты в консоль методом класса.*/

class SubscriberPhoneBook(
    val name: String,
    val number: Long?,
    var company: String?,
)

fun main() {

    val listPhoneBook: MutableList<SubscriberPhoneBook> = mutableListOf()
    println("Введите имя")
    val userName = readln()

    println("Введите номер телефона")
    val userNumber = readln().toLongOrNull()
    if (userNumber == null) {
        println("Вы не ввели номер телефона")
        return
    }

    println("Введите компанию")
    var userCompany: String?
    userCompany = readln()
    if (userCompany.isEmpty()) userCompany = null

    val subscriber1 = SubscriberPhoneBook(userName, userNumber, userCompany)
    
}
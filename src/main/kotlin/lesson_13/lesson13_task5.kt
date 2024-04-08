package lesson_13

/*Задача 5* к Уроку 13

Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги) и измени его название для избегания
конфликтов.

Для получения номера программа считывает ввод пользователя с типом String по умолчанию. Приведи строку к типу Long.
Если пользователь ввел что-либо, кроме цифр — программа падает.

Необходимо воспроизвести ошибку и вывести ее название в консоль.*/

class MySubscriberPhoneBook(
    val name: String,
    val number: Long?,
    var company: String?,
)

fun main() {

    println("Введите номер")
    try {
        val userNumber = readln().toLong()
    } catch (e: Exception) {
        println(e.message)
    }

}
package lesson_22

/*
Задача 2 к Уроку 22

Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.

Создай по одному экземпляру каждого класса и выведи их в консоль (объект целиком). Объясни разницу в выводе, используя
комментарий в коде.*/

class NewRegularBook(
    val nameBook: String,
    val autorBook: String,
)

data class NewDataBook(
    val nameBook: String,
    val autorBook: String,
)

fun main() {

    val regularBook1 = NewRegularBook("Книга1", "Автор1")
    val dataBook1 = NewDataBook("Книга1", "Автор1")


    println(regularBook1) // Выводит строковое представление объекта. Метод println использует приведение к строке toString
    println(dataBook1) // Здесь используется переопределённый метод toString
}
package lesson_22

/*
Задача 1 к Уроку 22

Создай обычный класс RegularBook и data class DataBook, каждый из которых содержит два свойства: название и автор.

Создай по два экземпляра каждого класса с одинаковыми свойствами, а затем сравни их (экземпляры), используя оператор сравнения.

Выведи результат сравнения в консоль для каждой пары объектов. Объясни разницу в выводе, используя комментарий в коде.*/

class RegularBook(
    val nameBook: String,
    val autorBook: String,
)

data class DataBook(
    val nameBook: String,
    val autorBook: String,
)

fun main() {

    val regularBook1 = RegularBook("Книга1", "Автор1")
    val regularBook2 = RegularBook("Книга1", "Автор1")

    val dataBook1 = DataBook("Книга1", "Автор1")
    val dataBook2 = DataBook("Книга1", "Автор1")

    println(regularBook1 == regularBook2) // Сравниваются ссылки на объекты в памяти, ссылки будут разными, так как это два объекта
    println(dataBook1 == dataBook2) // Сравниваются проинициализированные данные, данные равны
}
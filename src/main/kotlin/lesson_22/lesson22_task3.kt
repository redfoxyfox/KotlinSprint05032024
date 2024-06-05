package lesson_22

/*
Задача 3 к Уроку 22

Используя любой data class, в котором есть минимум 3 свойства, выполни деструктуризацию объекта на отдельные
переменные и выведи их значения в консоль.*/

data class Book(
    val nameBook: String,
    val autorBook: String,
    val price: Int,
)

fun main() {

    val book1 = Book("Книга1", "Автор1", 10)

    val (nameBook, autorBook, price) = book1

    println(nameBook)
    println(autorBook)
    println(price)

}
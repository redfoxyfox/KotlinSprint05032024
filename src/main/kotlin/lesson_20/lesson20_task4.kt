package lesson_20

/*
Задача 4 к Уроку 20

В разрабатываемом приложении мы реализуем список элементов. Изначально он представлен списком строк.
При помощи map преобразуй его в список лямбд, каждая из которых печатает в консоль: “Нажат элемент [название_элемента]”.

“Нажми” каждый четный элемент списка.*/

fun main() {

    val listElements = mutableListOf("первый", "второй", "третий", "четвертый")
    val listNewElements = listElements.map { element -> "Нажат элемент $element" }

    for (i in listNewElements.indices step 2) {
        println(listNewElements[i])
    }

}
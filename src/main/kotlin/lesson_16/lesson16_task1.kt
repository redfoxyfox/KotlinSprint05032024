package lesson_16

/*
Задача 1 к Уроку 16

На игральном кубике может выпасть одно число от 1 до 6.

Создай класс кубика, в котором будет проинициализировано одно поле со случайным числом. Единственный способ узнать
это число – вызвать специальный метод, который напечатает информацию в консоль.*/

class Cube {
    private val randomNumber = (1..6).random()

    fun returnNumber() {
        println(randomNumber)
    }

}

fun main() {

    val cube1 = Cube()
    println(cube1.returnNumber())

}
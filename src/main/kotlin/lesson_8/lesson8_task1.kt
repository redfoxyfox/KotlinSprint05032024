package lesson_8

/*Задача 1 к Уроку 8

Скрипт считает количество просмотров рекламы за день. Напиши программу, которая сохраняет в массив данные просмотров
за неделю (числа использовать на свое усмотрение). Каждая ячейка хранит количество просмотров за день.
Имея массив с данными, нужно посчитать сколько всего было просмотров за неделю. Результат вычислений выведи в консоль.*/

fun main() {

// Создаём пустой массив
    var arrayWeek = emptyArray<Int>()

// Создаём диапазон, откуда будем брать случайное значение просмотров за день
    val numberOfViews = 0..100

// Наполняем массив значениями
    for (i in 1..7) {
        arrayWeek += numberOfViews.random()
    }

// Суммируем элементы в массиве

val sumElementsInArray = arrayWeek.sum()

println(sumElementsInArray)

}
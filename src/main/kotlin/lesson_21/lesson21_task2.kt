package lesson_21

/*
Задача 2 к Уроку 21

Создай extension функцию evenNumbersSum для списка чисел, которая будет возвращать сумму всех четных чисел в списке.*/

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    this.forEach {
        if (it % 2 == 0) sum += it
    }
    return sum
}

fun main() {

    val listNumbers = listOf(2, 3, 6, 10)

    println(listNumbers.evenNumbersSum())

}
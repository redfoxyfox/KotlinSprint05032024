package lesson_2

/*
Задача 1 к Уроку 2

Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека.
У них следующие баллы по профильному предмету 3, 4, 3, 5. Пишем часть школьного софта, который посчитает средний балл
по английскому для этого класса.

– Написать выражение, которое высчитывает средний балл;
– Распечатать результат в консоль;
– В консоли должно быть выведено дробное число с 2 знаками после запятой.*/

fun main() {
    val ratingStudent1 = 3
    val ratingStudent2 = 4
    val ratingStudent3 = 3
    val ratingStudent4 = 5

    val averageRating = ((ratingStudent1 + ratingStudent2 + ratingStudent3 + ratingStudent4).toFloat() / 4)
    println(averageRating)
}
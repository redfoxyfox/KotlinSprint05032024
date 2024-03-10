package lesson_4

/*Задача 4 к Уроку 4

Программа тренировок разбивает упражнения на две группы: упражнения для мышц рук/пресса и ног/спины.
Она рекомендует делать упражнения на каждую группу мышц через день. Пользователь начал занятия с рук и пресса.
Напиши программу, которая будет сообщать, какие упражнения нужно выполнить сегодня.

Предположим, что сегодня 5 день тренировок. В первый день выполнялись упражнения для рук и пресса.
Выведи сообщение в виде нескольких красивых ровных строк.

Вывод должен быть таким:

Упражнения для рук:       true
Упражнения для ног:       false
Упражнения для спины:  false
Упражнения для пресса: true

- все сообщение должно печататься в одном println();
- при изменении значения переменной дня тренировки на 1 день вперед, вывод должен меняться.*/

fun main() {

    val day = 5
    val legsAndBack = (day % 2 == 0)
    val handsAndPress = !legsAndBack

    val exerciseToday = """
        Упражнения для рук: $handsAndPress
        Упражнения для ног: $legsAndBack
        Упражнения для спины: $legsAndBack
        Упражнения для пресса: $handsAndPress
    """.trimIndent()

    println(exerciseToday)

}
package lesson_12

import kotlin.random.Random

/*Задача 5* к Уроку 12

Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур и считать количество
дней с осадками за месяц.

Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.

- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса, передав в конструкторы случайные значения;
- сохрани в отдельные списки дневные и ночные температуры, а также список дней с осадками;
- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции из стандартной библиотеки;
- посчитай количество дней с осадками.

Выведи результаты в консоль.*/

class DayWeather(val daytimeTemperature: Int, val nighttimeTemperature: Int, val isRain: Boolean)

fun main() {

    val listDays: MutableList<DayWeather> = mutableListOf()
    val listDaytimeTemperature: MutableList<Int> = mutableListOf()
    val listNightTemperature: MutableList<Int> = mutableListOf()
    val listDaysWithRain: MutableList<Int> = mutableListOf()

    for (i in 1..30) {
        val daytimeTemperature = (-100..100).random()
        val nighttimeTemperature = (-100..100).random()
        val isRain = Random.nextBoolean()

        val day = DayWeather(daytimeTemperature, nighttimeTemperature, isRain)

        listDays.add(day)
        listDaytimeTemperature.add(daytimeTemperature)
        listNightTemperature.add(nighttimeTemperature)

        if (isRain) listDaysWithRain.add(i)
    }

    val averageValueDaytimeTemperature = listDaytimeTemperature.average() // вычислем среднее значения элементов списка
    val averageValueNightTemperature = listNightTemperature.average() // вычислем среднее значения элементов списка
    val quantityDaysWithRain = listDaysWithRain.size

    println("Средняя дневная температура: ${"%.2f".format(averageValueDaytimeTemperature)}") // округляем до сотых
    println("Средняя ночная температура: ${"%.2f".format(averageValueNightTemperature)}") // округляем до сотых
    println("Количество дней с осадками: $quantityDaysWithRain")

}
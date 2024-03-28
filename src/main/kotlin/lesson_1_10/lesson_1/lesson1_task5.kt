package lesson_1_10.lesson_1

/*Задача 5* к Уроку 1

Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.*/

const val NUMBER_OF_SECONDS_IN_AN_HOUR = 3600
const val NUMBER_OF_MINUTES_IN_AN_HOUR = 60
const val NUMBER_OF_SECONDS_IN_AN_MINUTE = 60

fun main() {

    val generalSeconds = 6480

    val hour = generalSeconds / NUMBER_OF_SECONDS_IN_AN_HOUR
    val minute = (generalSeconds % NUMBER_OF_SECONDS_IN_AN_HOUR) / NUMBER_OF_MINUTES_IN_AN_HOUR
    val seconds = generalSeconds % NUMBER_OF_SECONDS_IN_AN_MINUTE

    val time = String.format("%02d:%02d:%02d", hour, minute, seconds)

    println(time)

}
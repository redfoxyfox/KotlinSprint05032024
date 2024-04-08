package lesson_12

/*Задача 2 к Уроку 12

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- перепиши его, используя определение свойств в основном конструкторе;
- свойства не должны содержать значения по умолчанию (мы создаем каркас сущности для будущих объектов).

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.*/

class DaytimeWeatherNow(
    val daytimeTemperature: Int,
    val nighttimeTemperature: Int,
    val isRain: Boolean,
) {
    fun print() {
        println(daytimeTemperature)
        println(nighttimeTemperature)
        println(isRain)
    }
}

fun main() {

    val day1 = DaytimeWeatherNow(25, 16, true)

    day1.print()
}
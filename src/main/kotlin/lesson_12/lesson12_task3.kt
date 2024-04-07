package lesson_12

/*Задача 3 к Уроку 12

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- в этой задаче используй первичный конструктор без выделения памяти под свойства;
- поля должны быть объявлены и проинициализированы в теле класса;
- все поля с температурой должны иметь тип Int;
- программа не должна иметь других функций, кроме метода вывода информации о погоде.

В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются данные в Цельсиях.

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.*/

class DaytimeWeatherToday(_daytimeTemperature: Int, _nighttimeTemperature: Int, _isRain: Boolean) {

    var daytimeTemperature = _daytimeTemperature
    var nighttimeTemperature = _nighttimeTemperature
    var isRain = _isRain

    init {
        daytimeTemperature -= 273
    }

    fun print() {
        println(daytimeTemperature)
        println(nighttimeTemperature)
        println(isRain)
    }
}

fun main() {

    val day1 = DaytimeWeatherToday(275, 16, true)

    day1.print()

}
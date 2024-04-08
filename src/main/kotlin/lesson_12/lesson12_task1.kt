package lesson_12

/*Задача 1 к Уроку 12

Программа отслеживает погоду по дням. Создай класс для хранения данных о температуре и осадках для одного дня.

Объекты класса будут хранить:

- дневная температура;
- ночная температура;
- наличие осадков в течение суток.

Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.

- в классе создай переменные и проинициализируй их какими-нибудь значениями;
- затем в созданных объектах подставь другие значения этим переменным.

В этой задаче используй пустой конструктор.*/

class DaytimeWeather() {
    var daytimeTemperature = 20
    var nighttimeTemperature = 5
    var isRain = false

    fun print() {
        println(daytimeTemperature)
        println(nighttimeTemperature)
        println(isRain)

    }
}

fun main() {

    val day1 = DaytimeWeather()
    day1.daytimeTemperature = 30
    day1.nighttimeTemperature = 15
    day1.isRain = true

    val day2 = DaytimeWeather()
    day2.daytimeTemperature = 500
    day2.nighttimeTemperature = 35
    day2.isRain = false

    day1.print()
    day2.print()

}
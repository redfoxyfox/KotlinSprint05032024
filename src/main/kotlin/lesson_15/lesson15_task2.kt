package lesson_15

/*
Задача 2 к Уроку 15

Необходимо разработать простую систему мониторинга погодных условий, которая будет собирать данные о температуре и количестве осадков.


Создай абстрактный класс WeatherStationStats. Он будет служить родителем для классов-объектов погодных данных:
Temperature и PrecipitationAmount.

Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer. Метод отправки сообщения должен
определять тип переданного сообщения и в зависимости от результата передавать соответствующие данные.

Создай по одному объекту для разных типов погодных данных и протестируй работу программы.*/

abstract class WeatherStationStats {
    abstract val weatherData: Any

    fun sendingData() {
        if (weatherData is Int) println("Температура сейчас $weatherData градусов")
        else if (weatherData is String) println("Сейчас $weatherData осадков")
    }

}

class Temperature(
    override val weatherData: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    override val weatherData: String,
) : WeatherStationStats()

fun main() {

    val temperature = Temperature(15)
    val precipitationAmount = PrecipitationAmount("мало")

    temperature.sendingData()
    precipitationAmount.sendingData()
}



package lesson_12

/*Задача 4 к Уроку 12

Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.*/

class DaytimeWeatherTodayNow(_daytimeTemperature: Int, _nighttimeTemperature: Int, _isRain: Boolean) {

    var daytimeTemperature = _daytimeTemperature
    var nighttimeTemperature = _nighttimeTemperature
    var isRain = _isRain

    init {
        daytimeTemperature -= 273
        println(daytimeTemperature)
        println(nighttimeTemperature)
        println(isRain)
    }
    
}

fun main() {

    val day1 = DaytimeWeatherTodayNow(275, 16, true)

}
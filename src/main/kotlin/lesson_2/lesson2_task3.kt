package lesson_2

/*
Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия
вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.*/

fun main() {
    val checkOutHour = 9
    val checkOutMinute = 39
    val travelTime = 457

    // Запись в формате времени
    val time = java.time.LocalTime.of(checkOutHour, checkOutMinute)

    // Перевод минут в часы и минуты
    val travelHour = travelTime / 60
    val travelMinute = travelTime % 60

    // Прибавление ко времени старта времени в пути
    var arrivalTime = time.plusHours(travelHour.toLong())
    arrivalTime = arrivalTime.plusMinutes(travelMinute.toLong())

    println(arrivalTime)
}



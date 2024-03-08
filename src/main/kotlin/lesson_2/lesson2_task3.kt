package lesson_2

/*
Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия
вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.*/

const val NUMBER_OF_MINUTES_IN_AN_HOUR = 60

fun main() {
    val checkOutHour = 9
    val checkOutMinutes = 39
    val travelTime = 457

    // Перевод часов отправления в минуты
    val checkOutHourToMinutes = checkOutHour * NUMBER_OF_MINUTES_IN_AN_HOUR

    val checkOutTotal = checkOutHourToMinutes + checkOutMinutes
    val totalMinutes = checkOutTotal + travelTime

    val arrivalTimeHour = totalMinutes / NUMBER_OF_MINUTES_IN_AN_HOUR
    val arrivalTimeMinutes = totalMinutes % NUMBER_OF_MINUTES_IN_AN_HOUR

    println("$arrivalTimeHour:$arrivalTimeMinutes")

    /* Другое решение
       // Запись в формате времени
        val time = java.time.LocalTime.of(checkOutHour, checkOutMinutes)

        // Перевод минут в часы и минуты
        val travelHour = travelTime / NUMBER_OF_MINUTES_IN_AN_HOUR
        val travelMinute = travelTime % NUMBER_OF_MINUTES_IN_AN_HOUR

        // Прибавление ко времени старта времени в пути
        var arrivalTime = time.plusHours(travelHour.toLong())
        arrivalTime = arrivalTime.plusMinutes(travelMinute.toLong())
        println(arrivalTime)*/
}
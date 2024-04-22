package lesson_17

/*Задача 2 к Уроку 17

Опиши класс для корабля в мобильной игре. Поля хранят имя, среднюю скорость и порт приписки.

Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.

Создай экземпляр класса и протестируй работу.*/

class Ship(
    var _nameShip: String,
    val _averageSpeed: Int,
    val _port: String,

    ) {
    var nameShip: String = _nameShip
        set(value) {
            println("Имя нельзя перезаписать")
        }

    val averageSpeed: Int = _averageSpeed
    val port: String = _port
}

fun main() {

    val ship1 = Ship("Santa Maria", 10, "Палос-де-ла-Фронтера")
    ship1.nameShip = "Пинта"

}
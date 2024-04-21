package lesson_17

/*Задача 2 к Уроку 17

Опиши класс для корабля в мобильной игре. Поля хранят имя, среднюю скорость и порт приписки.

Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.

Создай экземпляр класса и протестируй работу.*/

class Ship() {
    var nameShip: String = "Santa Maria"
        set(value) {
            if (value != field) println("Имя нельзя перезаписать")
            field = value

        }

    val averageSpeed: Int = 10
    val port: String = "Палос-де-ла-Фронтера"
}

fun main() {

    val ship1 = Ship()
    ship1.nameShip = "Пинта"

}
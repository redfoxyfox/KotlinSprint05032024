package lesson_14

/*Задача 1 к Уроку 14

В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол. Все корабли построены на основе лайнера, но
у каждого свой функционал и дополнительные свойства.

У грузовых скорость меньше, а грузоподъемность больше. У ледоколов ниже и скорость, и вместительность, но они могут
колоть лёд. Лайнер может вмещать наибольшее количество пассажиров.

- спроектируй иерархию классов со значениями по умолчанию для каждого типа корабля;
- создай по 1 экземпляру каждого типа корабля.*/

open class Liner(
    val speed: Int = 12,
    val carryingCapacity: Int = 50_000,
    val numberOfPassengers: Int = 10_000,
)

class CargoShip(
    speed: Int = 10,
    carryingCapacity: Int = 100_000,
    numberOfPassengers: Int = 1000,
) : Liner()

class Iceboat(
    speed: Int = 7,
    carryingCapacity: Int = 30_000,
    numberOfPassengers: Int = 500,
) : Liner() {
    fun crushesIce() {
        println("Колет лёд")
    }
}

fun main() {

    val liner = Liner(13, 60_000, 15_000)
    val cargoShip = CargoShip(9, 80_000, 800)
    val iceboat = Iceboat(6, 20_000)

}
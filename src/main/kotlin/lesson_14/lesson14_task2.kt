package lesson_14

/*Задача 2 к Уроку 14

Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.

Каждый тип корабля обладает уникальным способом погрузки:

- лайнер выдвигает горизонтальный трап со шкафута;
- грузовой корабль активирует погрузочный кран;
- ледокол открывает ворота со стороны кормы.

Реализуй методы погрузки, специфичные для каждого вида корабля.

Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.*/

open class LinerBig(
    val speed: Int = 40,
    val carryingCapacity: Int,
    val numberOfPassengers: Int,
) {

    open fun embarkation() {
        println("Выдвинуть горизонтальный трап со шкафута")
    }

    open fun printInformationAboutShipProperties() {
        println(speed)
        println(carryingCapacity)
        println(numberOfPassengers)
        embarkation()

    }

}

class CargoShipBig(
    speed: Int = 10,
    carryingCapacity: Int = 100_000,
    numberOfPassengers: Int = 1000,
) : LinerBig(speed, carryingCapacity, numberOfPassengers) {

    override fun embarkation() {
        println("Активировать погрузочный кран")
    }

    override fun printInformationAboutShipProperties() {
        println(speed)
        println(carryingCapacity)
        println(numberOfPassengers)
        embarkation()

    }

}

class IceboatBig(
    speed: Int = 7,
    carryingCapacity: Int = 30_000,
    numberOfPassengers: Int = 500,
) : LinerBig(speed, carryingCapacity, numberOfPassengers) {

    fun crushesIce() {
        println("Колет лёд")
    }

    override fun embarkation() {
        println("Открыть ворота со стороны кормы")
    }

    override fun printInformationAboutShipProperties() {
        println(speed)
        println(carryingCapacity)
        println(numberOfPassengers)
        embarkation()

    }

}

fun main() {

    val liner = LinerBig(13, 60_000, 15_000)
    val cargoShip = CargoShipBig(9, 80_000, 800)
    val iceboat = IceboatBig(6, 20_000)

    liner.printInformationAboutShipProperties()
    println()
    cargoShip.printInformationAboutShipProperties()
    println()
    iceboat.printInformationAboutShipProperties()

}
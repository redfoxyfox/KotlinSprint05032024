package lesson_18

/*Задача 2 к Уроку 18

В игре используются типы игральных костей с разным количеством граней: 4, 6 и 8.

Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен быть метод, бросающий кость и
печатающий значение в консоль.

Для демонстрации полиморфизма “включения”:

- создай несколько объектов с разными гранями;
- собери из них список объектов, указав тип списка;
- выполни итерацию по списку и вызови у каждого объекта метод броска кости.*/



open class Dice(
    open val numberSides: Int,
) {
    open fun diceRoll() {}
}

class DiceOfFourSided(
    override val numberSides: Int = 4,
) : Dice(numberSides) {

    override fun diceRoll() = println((1..numberSides).random())

}

class DiceOfSixSided(
    override val numberSides: Int = 6,
) : Dice(numberSides) {

    override fun diceRoll() = println((1..numberSides).random())

}

class DiceOfEightSided(
    override val numberSides: Int = 8,
) : Dice(numberSides) {

    override fun diceRoll() = println((1..numberSides).random())

}

fun main() {

    val diceOfFourSided1 = DiceOfFourSided()
    val diceOfSixSided1 = DiceOfSixSided()
    val diceOfEightSided1 = DiceOfEightSided()

    val listDices: List<Dice> = listOf(diceOfFourSided1, diceOfSixSided1, diceOfEightSided1)

    listDices.forEach { it.diceRoll() }
}
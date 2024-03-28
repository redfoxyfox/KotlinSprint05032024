package lesson_10

/*Задача 1 к Уроку 10

Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости. Побеждает выбросивший наибольшее число.

- поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
- бросок кости вынеси в отдельную функцию, в которой генерируется случайное число от 1 до 6;
- в отдельные переменные сохрани результат работы функции для игрока и компьютера;
- после сравнения результатов, выведи соответствующее сообщение в консоль. Например: "Победило человечество" или "Победила машина".*/

fun main() {

    do {
        val throwMan = diceRoll()
        println("Ваш бросок: $throwMan")
        val throwPC = diceRoll()
        println("Бросок компьютера: $throwPC")

        if (throwMan > throwPC) println("Победило человечество")
        else if (throwMan < throwPC) println("Победила машина")
        else println("Ничья. Бросаем ещё раз.")
        
    } while (throwMan == throwPC)

}

fun diceRoll(): Int {
    val range = 1..6
    return range.random()
}
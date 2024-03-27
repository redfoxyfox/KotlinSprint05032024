package lesson_10

/*Задача 4 к Уроку 10

Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости. Побеждает выбросивший наибольшее число.
Теперь дай возможность пользователю играть до тех пор пока ему не надоест. В конце программа должна вывести сколько
партий он выиграл.

- после первого раунда программа задает вопрос: “Хотите бросить кости еще раз? Введите Да или Нет”;
- программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом количества выигрышных
партий человека;
- в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков);
- основная логика программы должна находиться в main(), а 2 другие функции будут вспомогательными.*/

const val USER_ANSWER_YES = "Да"

fun main() {

    println("Человечество победило ${gameProcess()} раз")

}

fun diceRolls(): Int {
    val range = 1..6
    return range.random()
}

fun gameProcess(): Int {
    var counterWin = 0

    do {
        val throwMan = diceRolls()
        println("Ваш бросок: $throwMan")
        val throwPC = diceRolls()
        println("Бросок компьютера: $throwPC")

        if (throwMan > throwPC) {
            println("Победило человечество")
            counterWin++
        } else if (throwMan < throwPC) println("Победила машина")
        else println("Ничья")

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userAnswer = readln()

    } while (userAnswer.equals(USER_ANSWER_YES, true))

    return counterWin

}
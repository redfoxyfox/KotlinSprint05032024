package lesson_5

import java.util.Calendar

/*Задача 3 к Уроку 5

Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42. Если угадать только одно – игрок
получает утешительный приз. Напиши программу, проверяющую выигрыш. Пользователь должен вводить числа в консоль.
Правильные числа заранее известны и хранятся в переменных. Оформить ввод текстовыми подсказками о том, что
нужно вводить. Вывести отдельным сообщением, какие числа были нужны для победы.

- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
- если не угадано ничего, вывести “Неудача!”;
- программа должна учитывать ввод чисел в обратном порядке.*/

fun main() {

    val range = 0..42
    val hiddenNumber1 = range.random()
    val hiddenNumber2 = range.random()
    val messageFirstNumber = "Введите первое число: "
    val messageSecondNumber = "Введите второе число: "
    val guessedTwoNumbers = "Поздравляем! Вы выиграли главный приз!"
    val guessedOneNumbers = "Вы выиграли утешительный приз!"
    val guessedZeroNumbers = "Неудача!"

    print(messageFirstNumber)
    val userNumber1 = readLine()!!.toInt()
    print(messageSecondNumber)
    val userNumber2 = readLine()!!.toInt()

    if ((userNumber1 == hiddenNumber1 || userNumber1 == hiddenNumber2) && (userNumber2 == hiddenNumber1 || userNumber2 == hiddenNumber2))
        println(guessedTwoNumbers)
    else if ((userNumber1 == hiddenNumber1 || userNumber1 == hiddenNumber2))
        println(guessedOneNumbers)
    else if ((userNumber2 == hiddenNumber1 || userNumber2 == hiddenNumber2))
        println(guessedOneNumbers)
    else println(guessedZeroNumbers)

    println("Для победы нужны были числа $hiddenNumber1 и $hiddenNumber2")

    /* Второе решение через массив
    val range = 0..42
    val hiddenNumber1 = range.random()
    val hiddenNumber2 = range.random()
    val listHiddenNumbers = arrayOf(hiddenNumber1, hiddenNumber2)
    val messageFirstNumber = "Введите первое число: "
    val messageSecondNumber = "Введите второе число: "
    val guessedTwoNumbers = "Поздравляем! Вы выиграли главный приз!"
    val guessedOneNumbers = "Вы выиграли утешительный приз!"
    val guessedZeroNumbers = "Неудача!"

    print(messageFirstNumber)
    val userNumber1 = readLine()!!.toInt()
    print(messageSecondNumber)
    val userNumber2 = readLine()!!.toInt()

    when {
        userNumber1 in listHiddenNumbers && userNumber2 in listHiddenNumbers -> println(guessedTwoNumbers)
        userNumber1 in listHiddenNumbers && userNumber2 !in listHiddenNumbers -> println(guessedOneNumbers)
        userNumber1 !in listHiddenNumbers && userNumber2 in listHiddenNumbers -> println(guessedOneNumbers)
        else -> println(guessedZeroNumbers)
    }

    println("Для победы нужны были числа $hiddenNumber1 и $hiddenNumber2 ")*/

}
package lesson_2

import kotlin.math.pow

/*
Задача 5* к Уроку 2

Напиши программу-калькулятор для банковского приложения (такой функционал бывает на промо экранах).
Используя формулу сложных процентов (ее можно загуглить), нужно посчитать размер вклада через 20 лет с такими условиями:

 – Клиент ввел в приложении сумму 70_000 рублей (считать ее известной заранее и проинициализировать переменную);
 – Процентная ставка 16,7% (проценты начисляются в конце года);
 – Подсчитать размер вклада через 20 лет;
 – Результат должен быть дробным числом с 3 знаками после запятой;
 – Ответ должен получиться таким 1536438.428.*/

const val NUMBER_OF_ACCRUALS_PER_YEAR = 1
const val CONVERSION_TO_PERCENTAGE = 100

fun main() {

    val sum = 70_000
    val interestRate = 16.7
    val depositTerm = 20

    val interestRateToPercent = interestRate / CONVERSION_TO_PERCENTAGE
    val resultAfter20Years =
        sum * ((1 + interestRateToPercent / NUMBER_OF_ACCRUALS_PER_YEAR)).pow(NUMBER_OF_ACCRUALS_PER_YEAR * depositTerm)

    println(String.format("%.3f", resultAfter20Years))

}
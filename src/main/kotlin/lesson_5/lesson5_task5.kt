package lesson_5

/*Задача 5* к Уроку 5

Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42. Пользователь вводит числа через консоль.

Требования к программе:

- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке.
- Поочередно введенные пользователем числа должны также храниться в списке.
- Для определения совпадений используй метод intersect() и сохрани размер полученной коллекции в отдельную переменную.

В зависимости от количества угаданных чисел программа выводит результат:

- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
- Если угадано одно число, пользователю выплачивается утешительный приз.
- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
- В конце игры вне зависимости от результата программа выводит выигрышные числа.*/

fun main() {

    val range = 0..42
    val hiddenNumber1 = range.random()
    val hiddenNumber2 = range.random()
    val hiddenNumber3 = range.random()
    val listHiddenNumbers = listOf(hiddenNumber1, hiddenNumber2, hiddenNumber3)

    val messageFirstNumber = "Введите первое число: "
    val messageSecondNumber = "Введите второе число: "
    val messageThirdNumber = "Введите третье число: "
    val guessedThreeNumbers = "Поздравляем! Вы угадали все числа и выиграли джекпот!"
    val guessedTwoNumbers = "Вы угадали два числа и получаете крупный приз!"
    val guessedOneNumber = "Вы угадали одно число и вам выплачивается утешительный приз!"
    val guessedZeroNumbers = "Вы не угадали ни одного числа."

    print(messageFirstNumber)
    val userNumber1 = readln().toInt()
    print(messageSecondNumber)
    val userNumber2 = readln().toInt()
    print(messageThirdNumber)
    val userNumber3 = readln().toInt()

    val listUserNumbers = listOf(userNumber1, userNumber2, userNumber3)
    val intersectedNumbers = listUserNumbers.intersect(listHiddenNumbers.toSet())
    val intersectedNumbersSize = intersectedNumbers.size

    when (intersectedNumbersSize) {
        3 -> println(guessedThreeNumbers)
        2 -> println(guessedTwoNumbers)
        1 -> println(guessedOneNumber)
        0 -> println(guessedZeroNumbers)
    }

    println("Выигрышные числа: $hiddenNumber1, $hiddenNumber2, $hiddenNumber3")

}
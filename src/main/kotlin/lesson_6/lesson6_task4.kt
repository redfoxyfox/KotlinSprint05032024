package lesson_6

/*Задача 4 к Уроку 6

Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9. Игроку дается 5 попыток, чтобы угадать это число.

 – если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает работу;
 – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество попыток;
 – после истечения попыток выводится сообщение “Было загадано число N”.*/

fun main() {
    val numberRange = 1..9
    val randomNumber = numberRange.random()
    var userNumber: Int

    for (i in 5 downTo 1) {
        println("Угадай число")
        userNumber = readln().toInt()
        if (userNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else println("Неверно. Осталось ${i - 1} попытки")
    }
    println("Было загадано число $randomNumber")

}
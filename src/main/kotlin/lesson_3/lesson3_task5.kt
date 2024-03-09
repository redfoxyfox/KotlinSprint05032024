package lesson_3

/*Задача 5* к Уроку 3

Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку, отправленную
игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода,
присвоить соответствующим переменным и распечатать по отдельности.*/


fun main() {

    val move = "D2-D4;0"
    val moveToList = move.split("-", ";")
    val start = moveToList[0]
    val finish = moveToList[1]
    val number = moveToList[2]

    println(start)
    println(finish)
    println(number)

/*    Второе решение
    val move = "D2-D4;0"
    val moveToList = move.split("-", ";")

    moveToList.forEach{
        println(it)
    }*/

/* Первое решение
val move = "D2-D4;0"
    val start = "${move[0]}${move[1]}"
    val finish = "${move[3]}${move[4]}"
    val number = move[6]

    println(start)
    println(finish)
    println(number)*/
}
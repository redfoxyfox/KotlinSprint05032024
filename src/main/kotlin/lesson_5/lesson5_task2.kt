package lesson_5

import java.util.Calendar

/*Задача 2 к Уроку 5

Изменить пример из видео урока. В уроке создавался блок кода, считывающий возраст. И если возраст больше или
равен 18 лет, показывали экран со скрытым контентом (выводили это сообщение в консоль в качестве имитации).

Новое условие:
 – Пользователь должен вводить не возраст, а год рождения;
 – Возраст пользователя высчитывать на основании текущего года;
 – Вычисляемый результат должен сравниваться с константой, в которой хранится возраст совершеннолетия (18);
 – Если год рождения подходит, выводить сообщение “Показать экран со скрытым контентом”.*/

const val AGE_OF_MAJORITY = 18

fun main() {

    val messageGreeting = "Введите свой год рождения в формате XXXX: "
    val getCurrentYear = Calendar.getInstance()
    val currentYear = getCurrentYear.get(Calendar.YEAR)
    val messageSuccessful = "Показать экран со скрытым контентом"
    val messageUnsuccessful = "Вернуться на главный экран"

    println(messageGreeting)
    val userYear = readLine()!!.toInt()
    val userAge = currentYear - userYear

    if (userAge >= AGE_OF_MAJORITY) println(messageSuccessful)
    else println(messageUnsuccessful)

}
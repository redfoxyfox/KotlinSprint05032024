package lesson_1_10.lesson_9

import java.util.*

/*Задача 5* к Уроку 9

Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

- результат должен исключать повторы;
- список должен выводиться в алфавитном порядке;
- все элементы списка выведены в одну строку, разделяя слова запятыми;
- первый элемент должен быть распечатан с заглавной буквы.*/

fun main() {
    val setIngredients = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите $i ингредиент")
        val userIngredient = readln()
        setIngredients.add(userIngredient)
    }

    // Сортируем список и превращаем в строку, разделяя слова запятыми
    val stringIngredientsSorted = setIngredients.sorted().joinToString(separator = ", ")

    // capitalize() is deprecated
    println(stringIngredientsSorted.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

}
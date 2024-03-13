package lesson_8

/*Задача 3 к Уроку 8

Используй условие из предыдущей задачи. Нужно доработать код, который проверяет наличие ингредиента в рецепте.
Однако, не используя цикл для поиска.*/

fun main() {

// Создаём массив со списком ингредиентов
    val setOfSaladIngredients = arrayOf("листья салата", "масло", "капуста")

    println("Какой ингредиент хочешь найти? ")
    val userIngridient = readln()

    if (setOfSaladIngredients.contains(userIngridient)) {
        println("Ингредиент \"$userIngridient\" в рецепте есть")
    }
    else {
        println("Такого ингредиента в рецепте нет")
    }

}
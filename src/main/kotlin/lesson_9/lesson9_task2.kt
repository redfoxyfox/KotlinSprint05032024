package lesson_9

/*Задача 2 к Уроку 9

Создай новый список ингредиентов, состоящий из 3 шт. Нужно расширить функционал программы – пусть у пользователя
будет возможность добавить к базовым ингредиентам из списка еще один свой.

- после создания базового списка, выведи его в консоль: "В рецепте есть базовые ингредиенты: [базовый_список_ингредиентов]";
- затем сообщи о возможности добавить свой: "Желаете добавить еще?” и активировать ввод с консоли;
- если пользователь ввел “нет” или что-то иное – заверши программу, если пользователь ввел “да” – запроси: "Какой ингредиент вы хотите добавить?";
- добавь считанное значение в базовый список;
- в конце выведи сообщение со списком всех элементов такого типа: "Теперь в рецепте есть следующие ингредиенты: [список_ингредиентов]".*/

fun main() {

    val listIngredients = mutableListOf("Утка", "Яблоки", "Соль")
    println("В рецепте есть базовые ингредиенты: $listIngredients")
    println("Желаете добавить ещё?")
    val userAnswer = readln()
    if (userAnswer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient = readln()
        listIngredients.add(userIngredient)
    } else return
    println("Теперь в рецепте есть следующие ингредиенты: $listIngredients")

}
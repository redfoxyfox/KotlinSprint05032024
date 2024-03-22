package lesson_9

/*Задача 3 к Уроку 9

Напиши программу, которая будет рассчитывать сколько потребуется ингредиентов для разного количества порций блюда.
Для примера возьмем рецепт омлета. Для одной порции нужно: яиц – 2шт., молока – 50 мл, сливочного масла – 15 гр.

– создай список с количеством ингредиентов для 1 блюда (где под индексами располагается количество для
яиц/молока/масла соответственно);
– запроси у пользователя количество порций;
– модернизировать список таким образом, чтобы вывести в консоль сообщение с количеством нужных ингредиентов такого
типа: “На [количество_порций] порций вам понадобится: Яиц – n, молока – n1, сливочного масла – n2]”.*/

fun main() {

    val listQuantityIngredients = mutableListOf(3, 50, 15)
    println("Укажите количество порций")
    val userQuantityOfServings = readln().toInt()
    for (i in 0..<listQuantityIngredients.size) {
        listQuantityIngredients[i] = listQuantityIngredients[i] * userQuantityOfServings
    }
    println("На $userQuantityOfServings порций вам понадобится: Яиц – ${listQuantityIngredients[0]}, молока – ${listQuantityIngredients[1]}, сливочного масла – ${listQuantityIngredients[2]}")

}
package lesson_1_10.lesson_9

/*Задача 1 к Уроку 9

Продолжи разработку приложения с рецептами, но с реализацией через список. Создай список ингредиентов блюда в виде списка, инициализируй любыми значениями.

– выведи в консоль сообщение: "В рецепте есть следующие ингредиенты: [список_ингредиентов]";
– выведи все ингредиенты, каждый с новой строки.*/

fun main() {

    println("Какое количество ингредиентов?")
    val userQuantityOfIngredients = readln().toInt()

    val listIngredients = mutableListOf<String>()

    for (i in 1..userQuantityOfIngredients) {
        println("Введите $i ингредиент")
        val userIngredient = readln()
        listIngredients.add(userIngredient)
    }
    println("В рецепте есть следующие ингредиенты: $listIngredients")

    for (i in 0..<listIngredients.size) {
        println(listIngredients[i])
    }
    
}
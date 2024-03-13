package lesson_8

/*Задача 5* к Уроку 8

Напиши программу, которая должна создавать массив из определенного количества ингредиентов, которые будет вводить пользователь.

- элементы вводятся по одному;
- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
- запрещено использовать список или динамический массив.*/

fun main() {

    println("Какое количество ингредиентов?")
    val userQuantityOfIngredients = readln().toInt()

    var arrayIngredients = emptyArray<String>()

    for (i in 1..userQuantityOfIngredients) {
        println("Введите $i ингредиент")
        val userIngredient = readln()
        arrayIngredients += userIngredient
    }
    println(arrayIngredients.contentToString())

}
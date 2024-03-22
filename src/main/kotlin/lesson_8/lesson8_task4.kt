package lesson_8

/*адача 4 к Уроку 8

Представим, что мы получили массив ингредиентов. Программа должна распечатать весь список ингредиентов,
затем заменить нужный ингредиент на новый по желанию пользователя. После этого программа должна показать обновленный список.

 – создай массив со списком ингредиентов и напечатай его в консоль;
 – запроси у пользователя информацию об ингредиенте, который он хочет заменить;
 – если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
 – если есть, запроси ингредиент, который пользователь хотел бы добавить;
 – выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список: [список_ингредиентов]”.*/

fun main() {

// Создаём массив со списком ингредиентов
    val setOfSaladIngredients = arrayOf("листья салата", "масло", "капуста")

    println(setOfSaladIngredients.contentToString())

    println("Какой ингредиент хотите заменить?")
    var userIngredientReplace = readln()

    while (userIngredientReplace !in setOfSaladIngredients) {
        println("Такого ингредиента нет")
        println("Какой ингредиент хотите заменить?")
        userIngredientReplace = readln()
    }
    println("Какой ингредиент хотите добавить?")

    val userIngredientAdd = readln()

//    Замена элемента
    setOfSaladIngredients[setOfSaladIngredients.indexOf(userIngredientReplace)] = userIngredientAdd

    println("Готово! Вы сохранили следующий список: ${setOfSaladIngredients.contentToString()}")
}
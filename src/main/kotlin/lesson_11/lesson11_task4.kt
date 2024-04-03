package lesson_11

/*Задача 4 к Уроку 11

Дизайнер предоставил макет Android-приложения:
https://www.figma.com/file/89K5JomHGyIkUFUaBKRBXi/RecipesApp?type=design&node-id=1%3A181&mode=design&t=DsOaqqRfAeCTY2eN-1

Для представленных экранов спроектируй следующие сущности для хранения данных:

- Категория рецепта
- Рецепт
- Ингредиент*/

class Ingrediens(
    val ingredient: String,
    val quantity: Int,
)

class Recipe(
    val name: String,
    val cover: Int,
    var favorites: Boolean = false,
    var numberOfServings: Int,
    val listIngredients: MutableList<Ingrediens>,
    val cookingMethod: String,
) {
    fun listQuantityIngredientsForUserPortions(numberOfServings: Int) {
        for (i in 0..<listIngredients.size) {
            listIngredients[i].quantity * numberOfServings
        }
    }
}

class CategoryRecipe(
    val name: String,
    val cover: Int,
    val listRecipe: MutableList<Recipe>,
)

fun main() {


}
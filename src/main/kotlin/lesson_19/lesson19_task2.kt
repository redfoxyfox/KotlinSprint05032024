package lesson_19

/*
Задача 2 к Уроку 19

В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.

 – создай enum класс с категориями;
 – создай метод внутри enum, который вернет текстовое название категории для пользователя;
 – создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод, который выводит
 инфо о товаре. Вызови его для нескольких созданных товаров;
 – для вывода информации о товаре, для категории используй метод определения категории.*/

enum class Category {
    CLOTH,
    STATIONERY,
    VARIA;

    fun returnCategory(category: Category): String {
        return when (category) {
            CLOTH -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            VARIA -> "Разное"
        }
    }

}

class Product(
    val nameProduct: String,
    val idProduct: Int,
    val categoryProduct: Category,
) {

    fun getInformation() {
        println(nameProduct)
        println(idProduct)
        println(categoryProduct.returnCategory(categoryProduct))
    }

}

fun main() {

    val product1 = Product("Штаны", 101, Category.CLOTH)
    val product2 = Product("Ручка", 102, Category.STATIONERY)
    val product3 = Product("Телефон", 101, Category.VARIA)

    product1.getInformation()
    println()
    product2.getInformation()
    println()
    product3.getInformation()

}
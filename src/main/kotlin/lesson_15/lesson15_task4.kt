package lesson_15

/*Задача 4 к Уроку 15

На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним. Все товары имеют
название и количество единиц на складе.

Для инструментов есть возможность поиска соответствующих комплектующих.

Опиши классы для категорий товаров. Имитируй процесс поиска текстовым сообщением «Выполняется поиск». Для выноса
логики поиска используй интерфейс.*/

interface Search {

    fun search() {
        println("Выполняется поиск")
    }

}

open class Product(
    val nameProduct: String,
    val quantity: Int,
) : Search

class MusicalInstrument(
    nameProduct: String,
    quantity: Int,
) : Product(nameProduct, quantity)

class Component(
    nameProduct: String,
    quantity: Int,
    val parentMusicalInstrument: String,
) : Product(nameProduct, quantity)

fun main() {

    val musicalInstrument1 = MusicalInstrument("Барабан", 3)
    val component1 = Component("Палочки", 3, "Барабан")
    val component2 = Component("Педаль", 0, "Барабан")
    val component3 = Component("Клавиши", 1, "Фортепиано")

    musicalInstrument1.search()


}



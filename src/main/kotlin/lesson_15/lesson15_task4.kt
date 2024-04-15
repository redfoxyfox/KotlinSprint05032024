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

class MusicalInstruments(
    val nameMusicalInstrument: String,
    val quantity: Int,
) : Search {}

class Components(
    val nameComponent: String,
    val quantity: Int,
    val parentMusicalInstrument: String,
)

fun main() {

    val musicalInstrument1 = MusicalInstruments("Барабан", 3)
    val component1 = Components("Палочки", 3, "Барабан")
    val component2 = Components("Педаль", 0, "Барабан")
    val component3 = Components("Клавиши", 1, "Фортепиано")

    musicalInstrument1.search()

}



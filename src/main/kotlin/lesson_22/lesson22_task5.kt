package lesson_22

/*
Задача 5* к Уроку 22

В Путеводитель для путешествующих автостопом по Галактике добавляется информация о месте или событии в галактике в
виде объектов.

Создай data class GalacticGuide cо свойствами:

- название места или события;
- описание места или события;
- дата и время события;
- расстояние места или события от Земли в световых годах.

Создай объект с информацией о звездной системе Alpha Centauri. Выведи информацию о месте, используя компонентные
функции data class.*/

data class GalacticGuide(
    val namePlaceOrEvent: String,
    val descriptionPlaceOrEvent: String,
    val eventDateAndTime: String? = null,
    val distanceToPlaceOrEvent: Double,
)

fun main() {

    val place1 = GalacticGuide(
        namePlaceOrEvent = "Alpha Centauri",
        descriptionPlaceOrEvent = "Tройная звёздная система в созвездии Центавра",
        distanceToPlaceOrEvent = 4.367
    )

    with(place1) {
        println(component1())
        println(component2())
        component3()?.let { println(it) }
        println(component4())

    }

}
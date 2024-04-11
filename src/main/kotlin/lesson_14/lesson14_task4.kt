package lesson_14

/*Задача 4 к Уроку 14

В компьютерной игре существуют планеты. У некоторых из них есть спутники.

Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.

Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.

- планета должна хранить список спутников.

Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.*/

open class HeavenlyBody(
    val name: String,
    val presenceOfAtmosphere: Boolean,
    val suitableForDisembarkation: Boolean,
)

class Satellite(
    name: String,
    presenceOfAtmosphere: Boolean = false,
    suitableForDisembarkation: Boolean = false,
) : HeavenlyBody(name, presenceOfAtmosphere, suitableForDisembarkation)

class Planet(
    name: String,
    presenceOfAtmosphere: Boolean = false,
    suitableForDisembarkation: Boolean = false,
    val listSatellites: List<Satellite>,
) : HeavenlyBody(name, presenceOfAtmosphere, suitableForDisembarkation)

fun main() {

    val satellite1 = Satellite(name = "Титан", suitableForDisembarkation = true)
    val satellite2 = Satellite(name = "Гиперион", presenceOfAtmosphere = true)

    val planet1 = Planet(
        name = "Сатурн",
        presenceOfAtmosphere = true,
        suitableForDisembarkation = true,
        listOf(satellite1, satellite2)
    )

    println(planet1.name)
    println(planet1.listSatellites.map { it.name })
}



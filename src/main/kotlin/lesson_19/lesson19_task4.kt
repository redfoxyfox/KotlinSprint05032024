package lesson_19

/*
Задача 4 к Уроку 19

В компьютерной игре танк может подбирать разные виды патронов. Патроны различаются силой удара. Синие – 5 единиц,
зеленые – 10, красные – 20.

 – создай enum класс для патронов и класс танка. У танка должны быть методы вооружения новым типом патронов и выстрела.
 При выстреле в консоль должен выводиться нанесенный урон;
 – создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
– экземпляр танка при создании ничем не заряжен;
 – в решении должен использоваться enum.*/

enum class AmmunitionType {
    BLUE,
    GREEN,
    RED,
}


class Tank(
    var ammunitionType: Int? = null
) {

    fun selectAmmunitionType(ammunitionType: AmmunitionType) {
        when (ammunitionType) {
            AmmunitionType.BLUE -> this.ammunitionType = 5
            AmmunitionType.GREEN -> this.ammunitionType = 10
            AmmunitionType.RED -> this.ammunitionType = 20
        }
    }

    fun takeShot() {
        println("Нанесён урон $ammunitionType")
    }

}

fun main() {

    val tank1 = Tank()
    tank1.selectAmmunitionType(AmmunitionType.BLUE)
    tank1.takeShot()
    tank1.selectAmmunitionType(AmmunitionType.GREEN)
    tank1.takeShot()
    tank1.selectAmmunitionType(AmmunitionType.RED)
    tank1.takeShot()
}
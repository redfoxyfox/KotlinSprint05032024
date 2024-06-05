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

enum class AmmunitionType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    private var ammunitionType: AmmunitionType? = null,
    private var ammunitionDamage: Int = 0,
) {

    fun selectAmmunitionType(ammunitionType: AmmunitionType) {
        this.ammunitionType = ammunitionType
        ammunitionDamage = ammunitionType.damage
    }

    fun takeShot() {
        if (ammunitionType == null) println("Зарядите орудие")
        else {
            println("Нанесён урон $ammunitionDamage")
            ammunitionType = null
        }
    }

}

fun main() {

    val tank1 = Tank()
    tank1.takeShot()
    tank1.selectAmmunitionType(AmmunitionType.BLUE)
    tank1.takeShot()
    tank1.takeShot()
    tank1.selectAmmunitionType(AmmunitionType.GREEN)
    tank1.takeShot()
    tank1.takeShot()
    tank1.selectAmmunitionType(AmmunitionType.RED)
    tank1.takeShot()

}
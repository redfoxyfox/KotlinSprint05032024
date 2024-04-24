package lesson_18

import kotlin.math.pow

/*Задача 4 к Уроку 18

В программе хранятся данные о посылках. Нужно написать иерархию классов, описывающих коробки.
Чтобы рассчитывать упаковку для посылок, в классе должен быть метод, возвращающий площадь поверхности посылки.

Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой. Если посылка – куб, то только с длиной ребра.*/

interface CalculateSurfaceArea {

    fun calculateSurfaceArea(length: Double, width: Double, height: Double) = length * width * height

    fun calculateSurfaceArea(length: Double) = length.pow(3)

}

open class Box() : CalculateSurfaceArea

class RectangularPackage(
    length: Double,
    width: Double,
    height: Double
) : Box()

class CubicPackage(
    length: Double,
) : Box()

fun main() {

}
package lesson_14

import kotlin.math.PI
import kotlin.math.pow

/*Задача 3 к Уроку 14

Напиши программу для работы с геометрическими фигурами: кругом и прямоугольником. Каждая фигура имеет свой цвет и уникальные параметры:

- для круга — радиус;
- для прямоугольника — ширину и высоту.

Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:

- для вычисления площади;
- для вычисления периметра.

Добавь классы-наследники для вышеупомянутых типов фигур. Реализуй методы для вычисления площади и периметра в каждом
из классов-наследников (формулы можно найти в интернете).

Создай несколько объектов разных цветов (черные и белые) и сохрани в единый список. Выведи в консоль:

- сумму периметров всех черных фигур;
- сумму площадей всех белых фигур.*/

abstract class Figure(
    val color: String,
) {

    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
    
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        return PI * radius.pow(2)
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }

}

class Rectangle(
    color: String,
    val lengthSide1: Double,
    val lengthSide2: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        return lengthSide1 * lengthSide2
    }

    override fun calculatePerimeter(): Double {
        return (lengthSide1 + lengthSide2) * 2
    }

}

fun main() {

    val circleWhite = Circle("Белый", 2.0)
    val circleBlack = Circle("Черный", 3.0)
    val rectangleWhite = Rectangle("Белый", 5.0, 6.0)
    val rectangleBlack = Rectangle("Черный", 7.0, 8.0)

    val listFigures: List<Figure> = listOf(circleWhite, circleBlack, rectangleWhite, rectangleBlack)
    var sumOfPerimetersOfBlackFigures = 0.0 // начальное значение суммы периметров всех черных фигур
    var sumOfAreasOfWhiteFigures = 0.0 // начальное значение суммы площадей всех белых фигур

    listFigures.map {
        if (it.color == "Черный")
            sumOfPerimetersOfBlackFigures += it.calculatePerimeter()
    }

    listFigures.map {
        if (it.color == "Белый")
            sumOfAreasOfWhiteFigures += it.calculateArea()
    }

    println("Сумма периметров всех черных фигур: ${"%.2f".format(sumOfPerimetersOfBlackFigures)} ")
    println("Сумма площадей всех белых фигур: ${"%.2f".format(sumOfAreasOfWhiteFigures)} ")
}



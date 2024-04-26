package lesson_18

import kotlin.math.pow

/*Задача 5* к Уроку 18

В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.

Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).*/

open class Object()

class Screen() : Object() {

    // Все варианты координат разных типов
    fun drawFigure(figure: Object, x: Int, y: Int) {}
    fun drawFigure(figure: Object, x: Float, y: Float) {}
    fun drawFigure(figure: Object, x: Int, y: Float) {}
    fun drawFigure(figure: Object, x: Float, y: Int) {}

}

class Circle(
    val radius: Int,
) : Object()

class Square(
    val side: Int,
) : Object()

class Point() : Object()


fun main() {

}
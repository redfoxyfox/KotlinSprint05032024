package lesson_16

/*
Задача 2 к Уроку 16

Создай класс, описывающий круг. У него должны быть методы, вычисляющие длину окружности и площадь круга, используя радиус.

Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным от изменений извне.
Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.

Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.*/

class Circle(
    private val radius: Int,
) {

    fun calculateCircumference() = 2 * APPROXIMATE_NUMBER_PI * radius

    fun calculateAreaOfCircle() = APPROXIMATE_NUMBER_PI * radius * radius

}

private const val APPROXIMATE_NUMBER_PI = 3.14
fun main() {

    val circle1 = Circle(3)

    println(circle1.calculateCircumference())
    println(circle1.calculateAreaOfCircle())

}
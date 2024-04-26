package lesson_18

/*Задача 3 к Уроку 18

В тамагочи есть лиса, собака и кошка. Они могут только есть и спать.

Лиса ест ягоды, собака – кости, а кошка – рыбу. У каждого животного есть имя. Эти действия отображаются в консоли
по такому шаблону: “[имя] -> [действие]”.

– опиши эти классы, используя полиморфизм;
– создай по одному объекту животного, сохрани их в список с принудительным указанием типа списка;
– в цикле вызывай метод приема пищи для каждого экземпляра.*/

interface AnimalActions {
    fun eat()
    fun sleep()
}

abstract class Animal(
    open val name: String
) : AnimalActions

class Fox(
    override val name: String = "Лиса"
) : Animal(name) {

    override fun eat() {
        println("$name ест ягоды")
    }

    override fun sleep() {
        println("$name спит")
    }

}

class Dog(
    override val name: String = "Собака"
) : Animal(name) {

    override fun eat() {
        println("$name ест кости")
    }

    override fun sleep() {
        println("$name спит")
    }

}

class Cat(
    override val name: String = "Кошка"
) : Animal(name) {

    override fun eat() {
        println("$name ест рыбу")
    }

    override fun sleep() {
        println("$name спит")
    }

}

fun main() {

    val fox1 = Fox()
    val dog1 = Dog()
    val cat1 = Cat()

    val listAnimals: List<Animal> = listOf(fox1, dog1, cat1)

    listAnimals.forEach { it.eat() }

}
package lesson_15

/*
Задача 1 к Уроку 15

В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.

- создай интерфейсы с методами передвижения для: карась, чайка, утка;
- создай для каждого существа классы, реализующие соответствующие интерфейсы;
- выведи сообщения в консоль, о том как они могут передвигаться.*/

interface Flight {

    fun fly() {
        println("летать")
    }

}

interface Walking {

    fun walk() {
        println("ходить")
    }

}

interface Swimming {

    fun swim() {
        println("плавать")
    }

}

class CrucianCarp() : Swimming {}
class Seagull() : Flight, Walking {}
class Duck() : Swimming, Flight, Walking {}

fun main() {

    val crucianCarp = CrucianCarp()
    val seagull = Seagull()
    val duck = Duck()

    println("Карп может:")
    crucianCarp.swim()
    println()
    println("Чайка может:")
    seagull.fly()
    seagull.walk()
    println()
    println("Утка может:")
    duck.fly()
    duck.walk()
    duck.swim()

}



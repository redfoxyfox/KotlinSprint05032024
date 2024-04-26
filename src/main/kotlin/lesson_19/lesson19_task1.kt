package lesson_19

/*
Задача 1 к Уроку 19

В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish),
петушок (Siamese fighting fish). Напиши enum класс, перечисляющий этих рыб. Сообщи пользователю, каких рыб он
может добавить в свой аквариум, распечатав список в консоль.*/

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun informUser(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGELFISH -> println("Скалярия")
        Fish.GOLDFISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}

fun main() {

    println("Вы можете добавить:")
    for (i in Fish.entries) informUser(i)

}
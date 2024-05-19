package lesson_21

/** Created by human Sergey Nikulin for humans.*/

/*
Задача 3 к Уроку 21

Создай класс игрока, который аналогичен классу Player из задания 20-2. Помимо имени у игрока должны быть поля с текущим
и максимальным здоровьем. Предположим, что у нас нет возможности редактировать класс (нельзя добавлять новые функции в класс Player).

Требуется реализовать функцию-расширение isHealthy для этого класса, которая будет возвращать true, если здоровье
игрока равно максимальному здоровью, и false в противном случае.*/

class Player(
    val nameuser: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy() = currentHealth == maxHealth

fun main() {

    val player = Player("Bob", 70, 100)
    println(player.isHealthy())

}
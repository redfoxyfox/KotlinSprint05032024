package lesson_16

/*
Задача 5* к Уроку 16

Для игры требуется создать класс игрока. С полями: имя, здоровье и сила удара. Здоровье должно изменяться только через
методы получения урона и лечения.

Добавить приватный метод, который вызывается, если при получении урона заканчивается здоровье. Смерть обнуляет силу
удара, здоровье и не позволяет лечиться.

Сымитируй бой, вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.*/

class Player(
    private val namePlayer: String,
    private var healthPlayer: Int,
    private var impactForcePlayer: Int,
) {

    fun takeDamage(damage: Int) {
        healthPlayer -= damage
        println("Игрок получил урон. Здоровье $healthPlayer ")
        if (healthPlayer <= 0) die()
    }

    fun restoreToHealth(restore: Int) {
        if (healthPlayer == 0) return
        healthPlayer += restore
        println("Игрок полечился. Здоровье $healthPlayer ")
    }

    private fun die() {
        impactForcePlayer = 0
        healthPlayer = 0
        println("Умер")
    }

}

fun main() {

    val player1 = Player("Sonya", 20, 5)

    player1.takeDamage(5)
    player1.restoreToHealth(3)
    player1.takeDamage(10)
    player1.restoreToHealth(1)
    player1.takeDamage(9)
    player1.restoreToHealth(10)
    
}
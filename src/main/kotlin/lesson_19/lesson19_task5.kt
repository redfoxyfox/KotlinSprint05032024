package lesson_19

/*
Задача 5* к Уроку 19

Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.

Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum. После ввода 5 человек, список выводится в консоль.

При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны).*/

enum class GenderHuman(val genderHumanForUser: String) {
    FEMALE("женский"),
    MALE("мужской"),
}

class Human(
    val nameHuman: String,
    var genderHuman: GenderHuman,
)

fun getGender(gender: GenderHuman): String {
    return when (gender) {
        GenderHuman.FEMALE -> "женский"
        GenderHuman.MALE -> "мужской"
    }
}

fun main() {

    var counter = 1
    val listHumans: MutableList<Human> = mutableListOf()

    while (counter <= 2) {
        println("Введите имя $counter человека")
        val nameHumanForUser = readln()

        println("Введите пол $counter человека: мужской или женский")
        var genderHumanForUser = readln().lowercase() // Теперь возможен ввод в любом регистре

        // Проверка на ввод не указанного пола
        while (genderHumanForUser != GenderHuman.FEMALE.genderHumanForUser && genderHumanForUser != GenderHuman.MALE.genderHumanForUser) {
            println("Вы ввели неправильный пол")
            println("Введите пол $counter человека: мужской или женский")
            genderHumanForUser = readln().lowercase()
        }

        when (genderHumanForUser) {
            GenderHuman.FEMALE.genderHumanForUser -> listHumans.add(
                Human(
                    nameHumanForUser,
                    GenderHuman.FEMALE
                )
            )

            GenderHuman.MALE.genderHumanForUser -> listHumans.add(
                Human(
                    nameHumanForUser,
                    GenderHuman.MALE
                )
            )
        }
        counter++
    }

    listHumans.forEach {
        println(it.nameHuman)
        println(getGender(it.genderHuman))
    }

}


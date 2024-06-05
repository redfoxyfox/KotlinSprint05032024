package lesson_21

/*
Задача 5* к Уроку 21

Игра имеет систему прокачки персонажей по различным навыкам. Опыт в каждом навыке хранится в виде пары ключ-значение,
где ключ — это название навыка (String), а значение — количество очков опыта (Int).

Создай extension функцию для интерфейса Map с названием maxCategory, которая будет возвращать название навыка, в
котором у игрока наибольшее количество очков опыта. Если два или более навыка имеют одинаковое максимальное значение,
функция должна возвращать любой из них.*/

fun main() {

    val skills = mapOf(
        "Strength" to 1000,
        "Attack" to 1000,
        "Defense" to 800
    )

    println(skills.maxCategory())

}

fun Map<String, Int>.maxCategory(): String? {
    var maxExperience = Int.MIN_VALUE
    var maxCategory: String? = null

    for ((category, experience) in this) {
        if (experience > maxExperience) {
            maxExperience = experience
            maxCategory = category
        }
    }

    return maxCategory
}
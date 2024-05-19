package lesson_21

/*
Задача 1 к Уроку 21

Реализуй extension функцию для класса String, которая будет возвращать количество гласных букв в строке.
Назови функцию vowelCount. Например, для строки "hello" функция должна вернуть 2.*/

fun String.vowelCount() {
    val listLetters =
        listOf(
            'а',
            'А',
            'е',
            'Е',
            'ё',
            'Ё',
            'и',
            'И',
            'о',
            'О',
            'у',
            'У',
            'ы',
            'Ы',
            'э',
            'Э',
            'ю',
            'Ю',
            'я',
            'Я',
            'a',
            'A',
            'i',
            'I',
            'e',
            'E',
            'o',
            'O',
            'u',
            'U'
        )
    println(this.count { it in listLetters })
}

fun main() {

    val userString = "Привет, мир!"
    userString.vowelCount()

}
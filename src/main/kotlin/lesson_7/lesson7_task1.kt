package lesson_7

/*Задача 1 к Уроку 7

Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся цифр и
строчных букв латинского алфавита (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль.*/

fun main() {

    var password = ""
    var symbolFromNumbers: String
    var symbolFromLetters: Char

    for (i in 1..3) {
        symbolFromNumbers = (0..9).random().toString()
        symbolFromLetters = ('a'..'z').random()
        password += symbolFromLetters + symbolFromNumbers
    }
    println(password)
}
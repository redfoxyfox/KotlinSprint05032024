package lesson_10

/*Задача 3 к Уроку 10

Напиши программу, которая генерирует пароли. Пароль должен состоять из последовательно чередующихся цифр и
специальных символов. Например, 4#4%2!.

- пользователь сам задает длину пароля;
- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля и
возвращающая готовый пароль;
- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).*/

fun main() {

    println("Введите длину пароля")
    val userLengthPassword = readln().toInt()

    println(passwordGeneration(userLengthPassword))

}

fun passwordGeneration(userLengthPassword: Int): String {
    val numberInterval = 0..9
    val arrayCharacters = ' '..'/'
    var stringPassword = ""
    var counter = 0

    while (counter < userLengthPassword) {
        stringPassword += numberInterval.random()
        counter++
        if (counter == userLengthPassword) break
        stringPassword += arrayCharacters.random()
        counter++
    }
    return stringPassword
}
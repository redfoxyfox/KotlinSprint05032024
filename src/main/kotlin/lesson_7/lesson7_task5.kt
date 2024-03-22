package lesson_7

/*Задача 5* к Уроку 7

Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.*/

fun main() {

    print("Задайте длину пароля: ")
    var userPasswordLength = readln().toInt()

// Проверка длины пароля >= 6
    while (userPasswordLength < 6) {
        print("Задайте длину пароля: ")
        userPasswordLength = readln().toInt()
    }

    val rangeNumbers = 0..9
    val rangeLowerCase = 'a'..'z'
    val rangeUppercase = 'A'..'Z'

    /* Условием является обязательное наличие трёх видов символов. Так как длина пароля всегда по условию > 3
    мы сразу включаем по 1 символу в будущий пароль*/

    val listPassword = mutableListOf(
        rangeNumbers.random().toString(),
        rangeLowerCase.random().toString(),
        rangeUppercase.random().toString(),
    )

    val allChars = rangeNumbers + rangeLowerCase + rangeUppercase

    for (i in 4..userPasswordLength) {
        listPassword.add(allChars.random().toString())
    }

// Перемешиваем список listPassword
    listPassword.shuffle()

    val password = listPassword.joinToString("")
    println(password)
}
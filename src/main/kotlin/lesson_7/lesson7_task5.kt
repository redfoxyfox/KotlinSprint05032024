package lesson_7

/*Задача 5* к Уроку 7

Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.*/

fun main() {

    print("Задайте длину пароля: ")
    val userPasswordLength = readln().toInt()
    val rangeNumbers = 0..9
    val rangeLowerCase = 'a'..'z'
    val rangeUppercase = 'A'..'Z'

/*    Условием является обязательное наличие трёх видов символов. Так как длина пароля всегда по условию > 3
    мы сразу включаем по 1 символу в будущий пароль*/

    val listPassword = mutableListOf(
        rangeNumbers.random().toString(),
        rangeLowerCase.random().toString(),
        rangeUppercase.random().toString(),
    )

//    Добавлям в список listPassword оставшееся количество элементов c помощью цикла

    for (i in 4..userPasswordLength) {

        /*Создаем массив из трёх диапазонов для того, чтобы случайным образом брать из этого массива какой-то диапазон,
        а из него случайнм образом его элемент*/

        val listRange = arrayOf(rangeNumbers.random().toString(), rangeLowerCase.random().toString(), rangeUppercase.random().toString())

        /*Создаём случайное число, которое будет определять номер элемента массива listRange*/

        val randomNumber = (0..2).random()

        listPassword.add(listRange[randomNumber])
    }

//    Перемешиваем список listPassword

    listPassword.shuffle()

//    Создаём пустую переменную, которая и будет содержать окончательный пароль
    var password = ""

//    Добавляем в пустую переменную все элементы списка

    listPassword.forEach {
        password += it
    }

    println(password)

}
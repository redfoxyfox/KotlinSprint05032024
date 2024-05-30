package lesson_21

import java.io.File
import java.util.*

/*
Задача 4 к Уроку 21

В курсовой работе мы разрабатываем телеграм-бота на Kotlin, который помогает пользователям учить иностранные слова.
Создай extension функцию для класса File из стандартной библиотеки, которая будет записывать переданное ей слово в файл.

- дополнительные материалы про файлы есть в 1-2 этапах курсовой;
- функция-расширение должна записывать текст в нижнем регистре;
- функция-расширение должна записывать текст в начало файла.*/

fun main() {

    val file = File("textFile.txt")
    file.createNewFile()
    file.writeWordToFile("ПрИвЕт")
    file.writeWordToFile("ПоКа")

}

fun File.writeWordToFile(word: String) {

    val newText = word.lowercase(Locale.getDefault()) + this.readText()
    this.writeText("")
    this.appendText(newText)

}
package lesson_17

/*Задача 3 к Уроку 17

В приложении для хранения облачных файлов есть папки и файлы.

Создай класс папки, который имеет имя, количество файлов и флаг “секретно”. Если флаг имеет значение true, то
при попытке прочитать имя, возвращать строку “скрытая папка” и количество файлов – 0. В ином случае возвращать ее
название и реальное количество файлов. Для реализации должны использоваться геттеры.

Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.*/

class Folder() {

    var nameFolder: String = "Папка 1"
        get() {
            return if (isSecret) {
                println("скрытая папка")
                println("Количество файлов: $numberOfFiles")
                "скрытая папка"
            } else {
                println(field)
                println("Количество файлов: $numberOfFiles")
                field
            }
        }

    var numberOfFiles: Int = 2
        get() = if (isSecret) 0 else field

    var isSecret: Boolean = true
}

fun main() {

    val folder1 = Folder()
    folder1.nameFolder

}
package lesson_17

/*Задача 3 к Уроку 17

В приложении для хранения облачных файлов есть папки и файлы.

Создай класс папки, который имеет имя, количество файлов и флаг “секретно”. Если флаг имеет значение true, то
при попытке прочитать имя, возвращать строку “скрытая папка” и количество файлов – 0. В ином случае возвращать ее
название и реальное количество файлов. Для реализации должны использоваться геттеры.

Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.*/

class Folder(
    _nameFolder: String,
    _numberOfFiles: Int,
    _isSecret: Boolean,
) {

    var nameFolder: String = _nameFolder
        get() = if (isSecret) "скрытая папка" else field

    var numberOfFiles: Int = _numberOfFiles
        get() = if (isSecret) 0 else field

    var isSecret: Boolean = _isSecret
}

fun main() {

    val folder1 = Folder("Папка 1", 2, true)

    println(folder1.nameFolder)
    println(folder1.numberOfFiles)

}
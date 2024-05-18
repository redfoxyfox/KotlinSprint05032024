package lesson_20

/*
Задача 5* к Уроку 20

Программируем робота. Робот умеет говорить и работать с модификаторами речи. Речь реализуется методом say().
Модификатор устанавливается функцией setModifier(), принимающей лямбду.

Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно). Реализуй модификатор, инвертирующий слова робота.

В результате в главной функции должен быть воспроизведен такой алгоритм:
– Вызов say(). Метод печатает одну фразу в обычном виде.
– Вызов setModifier(). Устанавливает переданный в него модификатор строки.
– Вызов say(). Метод выводит одну фразу в инвертированном виде.*/


val listPhrases = listOf(
    "Дай папиросочку, у тебя брюки в полосочку",
    "Примус",
    "Рыба",
    "Главрыба",
    "В очередь, сукины дети"
)

var currentModifier: ((String) -> String)? = null

fun say() {
    val phrase = listPhrases.random()
    val modifiedPhrase = currentModifier?.invoke(phrase) ?: phrase
    println(modifiedPhrase)
}

fun setModifier(mod: (String) -> String) {
    currentModifier = mod
}

fun main() {

    say()

    setModifier { phrase ->
        phrase.reversed()
    }

    say()
}
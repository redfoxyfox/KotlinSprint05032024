package lesson_17

/*Задача 1 к Уроку 17

Создай класс, описывающий элемент викторины. В primary конструкторе два текстовых свойства: вопрос и ответ.

Явно пропиши для вопроса геттер, для ответа геттер и сеттер.*/


class QuizElement(val question: String, var answer: String) {
    val _question: String = question
        get() = field

    var _answer: String = answer
        get() = field
        set(value) {
            if (value != field) field = "Неправильный ответ!"
        }
}

fun main() {

    val quizElement = QuizElement("Главный вопрос жизни, Вселенной и всего такого", "42")
    println(quizElement._question)
    println(quizElement._answer)
    quizElement._answer = "2"
    println(quizElement._answer)

}
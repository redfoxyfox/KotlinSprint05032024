package lesson_1

/*Задача 2 к Уроку 1

Скопируй решение из задачи 1 в новый файл с задачей 2. Теперь необходимо дописать реализацию программы для новых целей.
Имитируем логи с сервера.

 – Для начала выведи в консоль значения всех объявленных ранее переменных;
 – Далее нужно сделать так, чтобы программа хранила количество работников данного интернет-магазина (2000).
 Подбери подходящее наименование переменной, присвой ей значение и распечатай;
 – Далее представим, что один работник уволился. Закомментируй предыдущий код с распечаткой количества работников,
 присвой новое значение количества работников этой переменной и распечатай в консоль.

Оценивается не только правильная последовательность действий, но и грамотная организация кода (порядок объявления,
отступы и так далее).*/

fun main() {

    val numberOfOrders: UInt = 75U
    val thanksForTheOder: String = "Спасибо за покупку!"
    var numberOfEmployees: UInt = 2000U


    println(numberOfOrders)
    println(thanksForTheOder)
//    println(numberOfEmployees)
    numberOfEmployees = 1999U
    println(numberOfEmployees)

}
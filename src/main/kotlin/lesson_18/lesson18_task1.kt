package lesson_18

/*Задача 1 к Уроку 18

CRM (система управления взаимоотношениями с клиентами) обрабатывает заказы в интернет-магазине. Заказ содержит
информацию: номер заказа и товары. Если товар один, он хранится в виде строки, если несколько – в виде списка строк.

По запросу нужно печатать в консоль сообщение «Заказан товар: [название_товара]» или «Заказаны следующие товары:
[название_товара], … [название_товара]».

Создай 2 объекта заказа и вызови у них метод вывода информации и заказе. Реши задачу, используя полиморфизм с типом ad hoc.*/

class Order() {

    fun addInformationToOrder(
        numberOrder: Int,
        product: String
    ) {
        println("Заказан товар: $product")
    }

    fun addInformationToOrder(
        numberOrder: Int,
        product: List<String>
    ) {
        println("Заказаны товар: $product")
    }

}

fun main() {

    val order1 = Order()
    val order2 = Order()

    order1.addInformationToOrder(10001, "Морковка")
    order1.addInformationToOrder(10002, listOf("Капуста", "Петрушка"))

}
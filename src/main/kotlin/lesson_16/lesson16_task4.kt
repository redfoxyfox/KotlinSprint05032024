package lesson_16

/*
Задача 4 к Уроку 16

Создай класс, описывающий заказ в интернет-магазине. В заказе должны быть номер заказа и статус готовности.
Номер заказа должен быть недоступен для изменения.

Создай метод, который меняет статус заказа. Поменять статус заказа можно только отправив заявку менеджеру. Имитируй
это действие отдельной публичной функцией. Она будет принимать новый статус и обращаться к внутреннему методу
класса для изменения статуса.*/

class Order(
    val orderNumber: Int,
    private var readinessStatus: Boolean,
) {

    fun changeOrderStatus(newStatus: Boolean) {
        readinessStatus = newStatus
    }

}

fun main() {

    fun sendRequestToManager(newStatus: Boolean) {
        Order(8962, false).changeOrderStatus(true)
    }

}
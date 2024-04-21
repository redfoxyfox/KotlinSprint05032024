package lesson_17

/*Задача 4 к Уроку 17

Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
Опиши класс посылки с такими вводными:

- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.

Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика. При реализации использовать сеттер.*/

class Parcel() {
    val numberParcel: Int = 314159265
    var movementCounter: Int = 0
    var location: String = "Москва"
        set(value) {
            if (value != field) movementCounter++
            field = value
        }
}

fun main() {

    val parcel1 = Parcel()
    println(parcel1.movementCounter)
    parcel1.location = "Рим"
    println(parcel1.movementCounter)

}
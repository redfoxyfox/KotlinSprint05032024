package lesson_17

/*Задача 4 к Уроку 17

Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
Опиши класс посылки с такими вводными:

- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.

Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика. При реализации использовать сеттер.*/

class Parcel(
    val _numberParcel: Int,
    var _location: String,
) {
    val numberParcel: Int = _numberParcel
    var movementCounter: Int = 0
    var location: String = _location
        set(value) {
            if (value != field) movementCounter++
            field = value
        }
}

fun main() {

    val parcel1 = Parcel(53535, "Москва")
    println(parcel1.movementCounter)
    parcel1.location = "Рим"
    println(parcel1.movementCounter)

}
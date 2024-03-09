package lesson_4

/*Задача 2 к Уроку 4

При работе на таможенном терминале важно точно определить категорию каждого груза. Напиши программу, которая проверяет,
соответствует ли груз категории "Average". Эта категория имеет следующие параметры:
вес от 35 кг до 100 кг (включительно), и объем меньше 100 литров.

Создай программу, которая отображает соответствие данных груза категории "Average". Вывод программы может выглядеть
так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".

- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.*/

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME = 100

fun main() {

    val weightCargo1 = 20
    val weightCargo2 = 50
    val volumeCargo2 = 80
    val volumeCargo3 = 100

    println("Груз с весом $weightCargo1 кг соответствует категории 'Average': " +
            "${weightCargo1 >= AVERAGE_WEIGHT_MIN && weightCargo1 <= AVERAGE_WEIGHT_MAX}")
    println("Груз с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории 'Average': " +
            "${weightCargo2 >= AVERAGE_WEIGHT_MIN && weightCargo2 <= AVERAGE_WEIGHT_MAX && volumeCargo2 < AVERAGE_VOLUME}")
    println("Груз с объемом $volumeCargo3 л соответствует категории 'Average':" +
            "${volumeCargo3 < AVERAGE_VOLUME}")

}
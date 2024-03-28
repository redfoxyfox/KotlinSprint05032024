package lesson_1_10.lesson_4

/*Задача 5* к Уроку 4

Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:

- корабль не имеет повреждений;
- число экипажа составляет от 55 до 70 человек (включительно);
- на борту есть более 50 ящиков провизии;
- погода благоприятная или неблагоприятная.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:

- на борту рекомендованный состав экипажа - 70 человек;
- погода благоприятна;
- на борту есть 50 и более ящиков провизии.

В качестве входных данных используй информацию, введенную через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание. Программа должна анализировать
эти данные и выводить результат в консоль. Для анализа должно использоваться единое составное условие, состоящее
только из логических операторов.*/

const val IS_NOT_DAMAGE = true
const val MINIMUM_NUMBER_OF_TEAM = 55
const val MAXIMUM_NUMBER_OF_TEAM = 70
const val RECOMMENDED_NUMBER_OF_PROVISION_BOXES = 50
const val IS_GOOD_WEATHER = true
const val RECOMMENDED_NUMBER_OF_TEAM = 70

fun main() {
    println("Подтвердите отсутствие повреждений корабля: true/false")
    val isDamageNow = readln().toBoolean()

    println("Введите состав экипажа")
    val teamNow = readln().toInt()

    println("Введите количество ящиков на борту с провизией")
    val provisionNow = readln().toInt()

    println("Введите благоприятность метеоусловий: true/false")
    val isGoodWeatherNow = readln().toBoolean()

    val permission = (isDamageNow == IS_NOT_DAMAGE &&
            teamNow >= MINIMUM_NUMBER_OF_TEAM &&
            teamNow <= MAXIMUM_NUMBER_OF_TEAM &&
            provisionNow > RECOMMENDED_NUMBER_OF_PROVISION_BOXES &&
            isGoodWeatherNow == IS_GOOD_WEATHER) ||
            (teamNow == RECOMMENDED_NUMBER_OF_TEAM &&
            isGoodWeatherNow == IS_GOOD_WEATHER &&
            provisionNow >= RECOMMENDED_NUMBER_OF_PROVISION_BOXES)

    println("Корабль может отправляться в плавание: $permission")

}
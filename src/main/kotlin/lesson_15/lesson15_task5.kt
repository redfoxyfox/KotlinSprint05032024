package lesson_15

/*Задача 5* к Уроку 15

В логике мобильной игры есть грузовые и легковые автомобили с такими параметрами:

- грузовые машины могут перевозить одного пассажира и 2 тонны груза;
- легковые не перевозят груз, но могут вместить до 3 пассажиров.

Создай интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.

- учитывай максимальное и текущее количество перевозимых людей или грузов;
- интерфейсы должны содержать методы загрузки и разгрузки пассажиров или грузов.

Спроектируй классы и несколько объектов. Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.*/


interface LoadingAndUnloadingCargo {

    fun loadingCargo(amountOfCargo: Int) {
        if (amountOfCargo <= 2000) println("$amountOfCargo килограмм груза погружено в автомобиль")
        else println("Слишком большой вес, погрузка невозможна!")
    }

    fun unloadingCargo(amountOfCargo: Int) = println("$amountOfCargo килограмм груза выгружено из автомобиля")

}

interface LoadingAndUnloadingPassengers {

    fun loadingPassengers(numberOfPassengers: Int)
    fun unloadingPassengers(numberOfPassengers: Int)

}

interface MovingACar {
    fun movingACar() = println("Автомобиль приехал в пункт назначения")
}

class PassengerCar(
    val numberOfPassengers: Int = 0,
) : LoadingAndUnloadingPassengers, MovingACar {

    override fun loadingPassengers(numberOfPassengers: Int) {
        if (numberOfPassengers <= 3) println("$numberOfPassengers пассажира сели в автомобиль")
        else println("Слишком много людей, нет мест!")
    }

    override fun unloadingPassengers(numberOfPassengers: Int) =
        println("$numberOfPassengers пассажира вышли из автомобиля")

}

class Truck(
    val numberOfPassengers: Int = 0,
    val amountOfCargo: Int = 0,
) : LoadingAndUnloadingCargo, LoadingAndUnloadingPassengers, MovingACar {
    override fun loadingPassengers(numberOfPassengers: Int) {
        if (numberOfPassengers <= 1) println("$numberOfPassengers пассажир сел в автомобиль")
        else println("Слишком много людей, нет мест!")
    }

    override fun unloadingPassengers(numberOfPassengers: Int) =
        println("$numberOfPassengers пассажир вышел из автомобиля")
}


fun main() {

    val truck1 = Truck()
    val passengerCar1 = PassengerCar()
    val passengerCar2 = PassengerCar()


    truck1.loadingCargo(2000)
    truck1.loadingPassengers(1)
    passengerCar1.loadingPassengers(3)
    passengerCar2.loadingPassengers(2)

    truck1.movingACar()
    passengerCar1.movingACar()
    passengerCar2.movingACar()

    truck1.unloadingCargo(2000)
    truck1.unloadingPassengers(1)
    passengerCar1.unloadingPassengers(3)
    passengerCar2.unloadingPassengers(2)

}










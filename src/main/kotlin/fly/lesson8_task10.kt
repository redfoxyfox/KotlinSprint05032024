package fly

fun main() {
    val isGameOn = true

// Ввод пользователем длины и высоты табицы. Проверка на вхождение в указанный диапазон
    val userHorizontalLength = userHorizontalLength()
    val userVerticalLength = userVerticalLength()

    /*Выбор максимального значения из ширины и высоты таблицы. Таблица строится как квадрат со стороной равной этому максимальному значению
    * потом лишние ячейки удаляются*/

// Количество ячеек в таблице
    val numberOfCellsInTheTable = userVerticalLength * userHorizontalLength

// Создаём класс каждой ячейки. Для этого создаём пустой список и через цикл добавляем в него эксземпляры класса
    // Возвращает 2 значения: класс и список
    /*    val cellList = cellList(numberOfCellsInTheTable, maximumTableSize)*/

    val cellList: MutableList<Cells> = mutableListOf()
    var horizontalIndex = 1
    var verticalIndex = 1

    var cellTemplate: Cells
    for (i in 1..numberOfCellsInTheTable) {
        cellTemplate = Cells(horizontalIndex, verticalIndex, i)

        cellList.add(cellTemplate)

        if (i % userHorizontalLength == 0) {
            horizontalIndex++
            verticalIndex = 0
        }
        verticalIndex++
        println("${cellTemplate.horizontalIndex} ${cellTemplate.verticalIndex} ${cellTemplate.cellNumber} ${cellTemplate.horizontalIndex} ${cellTemplate.verticalIndex}")
    }

// Печатаем таблицу с заданными пользователем размерами
    printOriginalTable(userVerticalLength, userHorizontalLength, cellList)

    println("Хотите ли вы усложнить игру и удалить ячейки из таблицы? Напишите ДА или НЕТ")
    var userAnswer = readln()
    while (userAnswer != "ДА" && userAnswer != "НЕТ") {
        println("Хотите ли вы усложнить игру и удалить ячейки из таблицы? Напишите ДА или НЕТ")
        userAnswer = readln()

        if (userAnswer == "да" || userAnswer == "нет") println("Ну написано же ответить большими буквами!")
    }

    var userCellDelete: Int   // Номер ячейки по умолчанию, которую надо удалить.
    var isNotDeletedCells = false
    var listCellsDelete =
        mutableListOf<Int>() // Создали список, куда будем заносить номера ячеек, которые пользователь хочет удалить.
    if (userAnswer == "НЕТ") {
        println("Ну и хорошо, играйте на уровне детского сада")
        listCellsDelete =
            mutableListOf(1) // Создаем непустой список, чтобы при отсутствии удаенных ячеек, все равно отрисовывалась таблица
        isNotDeletedCells = true

    } else {
        while (userAnswer == "ДА") {
            println("Введите номер ячейки, которую хотите удалить: ")
            userCellDelete = readln().toInt()
            while (userCellDelete > numberOfCellsInTheTable || userCellDelete <= 0) {
                println("Такой ячейки в таблице нет. Введите заново: ")
                userCellDelete = readln().toInt()
            }
            cellList[userCellDelete - 1].isCellExists =
                false // Меняем значение в экземпляре класса с выбранной ячейкой

            listCellsDelete.add(userCellDelete) // Добавляем в список номера ячеек, которые пользователь хочет удалить

            println("Вы ввели ячейку № $userCellDelete. Хотите удалить ещё? ДА или НЕТ.")
            userAnswer = readln()

            while (userAnswer != "ДА" && userAnswer != "НЕТ") {
                println("Введите ДА или НЕТ")
                userAnswer = readln()
            }
        }
    }
    println("Введите номер ячейки, где будет находиться муха")
    var userCellWithFly = readln().toInt()
    while (userCellWithFly !in 1..numberOfCellsInTheTable) {
        println("Такой ячейки в таблице нет. Введите заново: ")
        userCellWithFly = readln().toInt()
        if (userCellWithFly in listCellsDelete) {
            println("Эта ячейка удалена, муха не может быть здесь. Введите заново ")
            userCellWithFly = readln().toInt()
        }
    }
    cellList[userCellWithFly - 1].inCellFly = true
    val listCoordinatesFly =
        mutableListOf(cellList[userCellWithFly - 1].horizontalIndex, cellList[userCellWithFly - 1].verticalIndex)


    /*    println(listCellsDelete)*/
    /*    for (i in 0..numberOfCellsInTheTable - 1) {
            println("${cellList[i].cellNumber} ${cellList[i].isCellExists} ${cellList[i].inCellFly}")
        }*/

    println("Ваша таблица выглядит так:")
    var lineBreakIndex = 0
    var tableString = ""
    for (n in 1..userVerticalLength) {

        // Рисуем верхнюю границу ячеек
        for (k in 1..userHorizontalLength) {
            print(" ——————")
        }

        println()
        print("|")

        for (j in 1..userHorizontalLength) {

            val index = j + lineBreakIndex

            for (ii in 0..<listCellsDelete.size) {

                if (cellList[listCellsDelete[ii] - 1].horizontalIndex == n && cellList[listCellsDelete[ii] - 1].verticalIndex == j && !isNotDeletedCells) {
                    tableString = "||||||"
                    break
                } else if (cellList[listCellsDelete[ii] - 1].horizontalIndex == n && cellList[listCellsDelete[ii] - 1].verticalIndex == j && isNotDeletedCells) {
                    tableString = if (index <= 9) {
                        "  0$index  "
                    } else {
                        "  $index  " // Чтобы таблица была ровной при однозначных числах
                    }
                } else if (cellList[userCellWithFly - 1].horizontalIndex == n && cellList[userCellWithFly - 1].verticalIndex == j) {
                    tableString = "  XX  "
                    break
                } else if (index <= 9) {
                    tableString = "  0$index  "
                } else {
                    tableString =
                        "  $index  " // Чтобы таблица была ровной при однозначных числах
                }
            }
            print(tableString)
            print("|")
        }
        lineBreakIndex += userHorizontalLength
        println()
    }

    // Рисуем нижнюю границу ячеек
    for (k in 1..userHorizontalLength) {
        print(" ——————")
    }
    Thread.sleep(1000)
    for (i in 1..10) println()

    println(
        """Управление:
    | "W" для хода вверх
    | "S" для хода вниз
    | "A" для хода влево
    | "D" для хода вправо """.trimMargin()
    )
    var cellWithFly = 1
    for (i in cellList) {
        if (i.horizontalIndex == listCoordinatesFly[0] && i.verticalIndex == listCoordinatesFly[1]) {
            cellWithFly = i.cellNumber
        }
    }

    do {
        println("Муха в ячейке №$cellWithFly")

        println("ВАШ ХОД")
        val userMove = readln()

        when (userMove) {
            "W" -> {
                if (listCoordinatesFly[0] == 1 || !cellList[cellWithFly - userHorizontalLength - 1].isCellExists) {
                    println("Вы вышли за поле. Позор!")
                    break
                } else {
                    listCoordinatesFly[0] = listCoordinatesFly[0] - 1
                }
            }

            "S" -> {
                if (listCoordinatesFly[0] == userVerticalLength || !cellList[cellWithFly + userHorizontalLength - 1].isCellExists) {
                    println("Вы вышли за поле. Позор!")
                    break
                } else {
                    listCoordinatesFly[0] = listCoordinatesFly[0] + 1
                }
            }

            "A" -> {
                if (listCoordinatesFly[1] == 1 || !cellList[cellWithFly - 2].isCellExists) {
                    println("Вы вышли за поле. Позор!")
                    break
                } else {
                    listCoordinatesFly[1] = listCoordinatesFly[1] - 1
                }
            }

            "D" -> {
                if (listCoordinatesFly[1] == userHorizontalLength || !cellList[cellWithFly].isCellExists) {
                    println("Вы вышли за поле. Позор!")
                    break
                } else {
                    listCoordinatesFly[1] = listCoordinatesFly[1] + 1
                    println(cellList[cellWithFly].isCellExists)
                }
            }
        }

        for (i in cellList) {
            if (i.horizontalIndex == listCoordinatesFly[0] && i.verticalIndex == listCoordinatesFly[1]) {
                cellWithFly = i.cellNumber
            }
        }

        println("Теперь муха в ячейке №$cellWithFly")
        println()
        println("ХОД МУХИ")

        // Ходы мухи
        val listMoveFly = mutableListOf<String>()

        if (listCoordinatesFly[0] == 1 || !cellList[cellWithFly - userHorizontalLength - 1].isCellExists) {
            listMoveFly.add("Вверх")
        }

        if (listCoordinatesFly[0] in 1..<userVerticalLength || !cellList[cellWithFly + userHorizontalLength - 1].isCellExists) {
            listMoveFly.add("Вниз")
        }

        if (listCoordinatesFly[1] == 1 || !cellList[cellWithFly - 2].isCellExists) {
            listMoveFly.add("Влево")
        }

        if (listCoordinatesFly[1] in 1..<userHorizontalLength || !cellList[cellWithFly].isCellExists) {
            listMoveFly.add("Вправо")
        }

        when (listMoveFly.random()) {
            "Вверх" -> {
                listCoordinatesFly[0] = listCoordinatesFly[0] - 1
                println("МУХА ходит \"Вверх\"")
            }

            "Вниз" -> {
                listCoordinatesFly[0] = listCoordinatesFly[0] + 1
                println("МУХА ходит \"Вниз\"")
            }

            "Влево" -> {
                listCoordinatesFly[1] = listCoordinatesFly[1] - 1
                println("МУХА ходит \"Влево\"")
            }

            "Вправо" -> {
                listCoordinatesFly[1] = listCoordinatesFly[1] + 1
                println("МУХА ходит \"Вправо\"")
            }
        }
        for (i in cellList) {
            if (i.horizontalIndex == listCoordinatesFly[0] && i.verticalIndex == listCoordinatesFly[1]) {
                cellWithFly = i.cellNumber
            }
        }

    } while (isGameOn)

    println("Последний раз Муха была в ячейке №$cellWithFly ")
    println(listCoordinatesFly)

}

// Ввод пользователем высоты таблицы. Проверка на вхождение в указанный диапазон
fun userHorizontalLength(): Int {
    print("Введите количество ячеек по горизонтали от 3 до 9: ")
    var userHorizontalLength = readln().toInt()
    while (userHorizontalLength !in 3..9) {
        print("Введите количество ячеек по горизонтали от 3 до 9: ")
        userHorizontalLength = readln().toInt()
    }
    return userHorizontalLength
}

// Ввод пользователем длины табицы. Проверка на вхождение в указанный диапазон
fun userVerticalLength(): Int {
    print("Введите количество ячеек по вертикали от 3 до 9: ")
    var userVerticalLength = readln().toInt()
    while (userVerticalLength !in 3..9) {
        print("Введите количество ячеек по вертикали от 3 до 9: ")
        userVerticalLength = readln().toInt()
    }
    return userVerticalLength
}

// Печатаем таблицу
fun printOriginalTable(userVerticalLength: Int, userHorizontalLength: Int, cellList: MutableList<Cells>) {
    println("Ваша таблица выглядит так:")
    var lineBreakIndex = 0
    for (i in 1..userVerticalLength) {

        // Рисуем верхнюю границу ячеек
        for (k in 1..userHorizontalLength) {
            print(" ——————")
        }

        println()
        print("|")

        for (j in 1..userHorizontalLength) {
            var tableString: String
            val index = j + lineBreakIndex
            tableString = if (!cellList[j].isCellExists) {
                "||||||"
            } else


                if (index <= 9) {
                    "  0$index  " // Чтобы таблица была ровной при однозначных числах
                } else {
                    "  $index  "
                }
            print(tableString)
            print("|")
        }
        lineBreakIndex += userHorizontalLength
        println()
    }

    // Рисуем нижнюю границу ячеек
    for (k in 1..userHorizontalLength) {
        print(" ——————")
    }
    println()

}





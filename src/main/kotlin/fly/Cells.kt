package fly

class Cells(
    val horizontalIndex: Int,
    val verticalIndex: Int,
    val cellNumber: Int,
    var isCellExists: Boolean = true,
    var inCellFly: Boolean = false,
)
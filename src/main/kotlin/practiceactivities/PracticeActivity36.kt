package practiceactivities
fun main () {

    val matrix = mutableListOf(mutableListOf<Int>(0, 0, 0), mutableListOf<Int>(0, 0, 0), mutableListOf<Int>(0, 0, 0))
    var row = 0
    var i = 1
    while (row < matrix.size) {
        var column = 0
        while (column < matrix[row].size) {
            print("Enter number $i: ")
            matrix[row][column] = readln().toInt()
            column++
            i++
        }
        row++

    }
    row = 0
    while (row < matrix.size) {
        var column = 0
        while (column < matrix[row].size) {
            print("${matrix[row][column]} \t")
            column++
        }
        row++
        println()
        val n = matrix.size
        val sum = n * (n * n + 1) / 2

        // Check rows sum
        for (row in matrix) {
            if (row.sum() != sum) {
                return
            }
        }

        // Check columns sum
        for (col in matrix.indices) {
            var colSum = 0
            for (row in matrix) {
                colSum += row[col]
            }

        }

        // Check diagonal sum (top-left to bottom-right)
        var diagonalSum = 0
        for (i in matrix.indices) {
            diagonalSum += matrix[i][i]
        }


        // Check diagonal sum (top-right to bottom-left)
        diagonalSum = 0
        for (i in matrix.indices) {
            diagonalSum += matrix[i][n - i - 1]
        }
    }
}
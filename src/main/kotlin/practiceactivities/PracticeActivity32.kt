package practiceactivities

fun main() {
    val athleteSales = mutableMapOf<String, Double>()
    for (i in 1..5) {
        print("Enter athlete $i: ")
        val athlete = readln()
        print("Enter sales: ")
        val sales = readln().toDouble()
        athleteSales[athlete] = sales
    }
    println("\nTop SportsMan\nName\t\tSales\n===================================")
    var totalSales = 0.0
    athleteSales.toList().sortedByDescending { (_, value) -> value }.take(5).forEach { (key, value) ->
        println("$key\t${"$%.2f".format(value)}")
        totalSales += value
    }
    println("===================================\nTotal\t\t${"$%.2f".format(totalSales)}")
}

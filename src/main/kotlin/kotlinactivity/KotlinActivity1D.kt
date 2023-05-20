package kotlinactivity
import java.util.*

fun main() {
    var dividedBy = 0
    var validInput = false
    val amounts = mutableListOf<Double>()
    for (i in 1..5) {
        print("Enter amount $i: ")
        amounts.add(readln().toDouble())
    }

    while (!validInput) {
        try {
            println("Divide the value by how many?")
            dividedBy = readln().toInt()
            validInput = true
        } catch (exception: NumberFormatException) {
            println("Invalid input. Please enter a valid integer.")

        }

    }
    val sum: Double = amounts.reduce { acc, amount -> acc + amount }
    val total: Double = if (dividedBy != 0) sum / dividedBy else 0.0
    println("Your total is: $total ")

}


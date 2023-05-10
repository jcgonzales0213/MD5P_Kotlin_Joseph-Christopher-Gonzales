package practiceactivities
fun main() {
    try {
        println("Enter a positive integer:")
        val input = readln()
        val number = input?.toInt()

        if (number != null && number > 0) {
            val factorial = calculateFactorial(number)
            println("Factorial of $number is: $factorial")
        } else {
            throw IllegalArgumentException()
        }
    } catch (e: NumberFormatException) {
        println("Error: Invalid input. Please enter a positive integer.")
    } catch (e: IllegalArgumentException) {
        println("Error: Invalid input. Please enter a positive integer.")
    } finally {
        println("Program executed.")
    }
}

fun calculateFactorial(n: Int): Long {
    var factorial: Long = 1
    for (i in 2..n) {
        factorial *= i
    }
    return factorial
}

package practiceactivities

fun main() {
    try {
        print("Enter a decimal number: ")
        val input = readln()
        val number = input.toDoubleOrNull()?.toInt()
        if (number != null) {
            println("Converted to integer: $number")
        } else {
            throw NumberFormatException()
        }
    } catch (e: NumberFormatException) {
        println("Error: Invalid input. Please enter a valid decimal number.")
    } finally {
        println("Program execution complete.")
    }
}

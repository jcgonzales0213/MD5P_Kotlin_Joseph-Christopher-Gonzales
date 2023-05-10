package practiceactivities

fun main() {
    try {
        val num1 = getIntegerInput("Enter the first number: ")
        val num2 = getIntegerInput("Enter the second number: ")

        performOperations(num1, num2)
    } catch (e: ArithmeticException) {
        println("Error: Arithmetic overflow. The result of the operation exceeds the maximum value of an integer.")
    } catch (e:NumberFormatException) {
        println("Error:NumberFormatException")
    }finally {
        println("Program execution complete.")
    }
}

fun getIntegerInput(prompt: String): Int {
    print(prompt)
    return readln().toInt()

}

fun performOperations(num1: Int, num2: Int) {
    val addition = num1.toInt() + num2.toInt()
    println("Addition: $num1 + $num2 = $addition")

    val subtraction = num1.toInt() - num2.toInt()
    println("Subtraction: $num1 - $num2 = $subtraction")

    val multiplication = num1.toInt() * num2.toInt()
    println("Multiplication: $num1 * $num2 = $multiplication")

    val division = num1.toInt() / num2.toInt()
    println("Division: $num1 / $num2 = $division")
}

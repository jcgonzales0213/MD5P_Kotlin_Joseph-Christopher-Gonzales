package practiceactivities
fun main() {

    try {
        print("Enter the first number: ")
        val num1 = readln().toInt()

        print("Enter the second number: ")
        val num2 = readln().toInt()

        val result = {n1:Int , n2:Int -> n1/n2 }
        println("Result: ${result(num1,num2)}")
    } catch (exception: NumberFormatException) {
        println("Error: Invalid input, please enter numbers only.")
    } catch (exception: ArithmeticException) {
        println("Error: Division by zero.")
    } finally {
        println("Thank you for using our division program!")
    }
}

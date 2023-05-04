fun main(){
    var number1 = 0
    var number2 = 0
    var validInput = false

    while (!validInput) {
        try {
            println("***********************")
            println("Simple calculator")
            println("***********************")
            println("Enter number 1: ")
            number1 = readln().toInt()
            println("Enter number 2: ")
            number2 = readln().toInt()
            validInput = true
            println("The quotient is ${number1/number2}")
        } catch (exception: Exception) {
            println("Wrong Input! Integer Inputs only!")
        }
    }
    println("This is a test")
}

fun main(){
    //declare all variables
    var number1 : Int = 0
    var number2 : Int = 0
    var number3 : Int = 0
    var smallestNumber : Int = 0

    //input
    println("Enter number 1:")
    number1 = readln().toInt()
    println("Enter number 2:")
    number2 = readln().toInt()
    println("Enter number 3:")
    number3 = readln().toInt()

    //output
    smallestNumber = when {
        number1 <= number2 && number1 <= number3 -> number1
        number2 <= number1 && number2 <= number3 -> number2
        else -> number3
    }

    println("The smallest number is $smallestNumber")
}
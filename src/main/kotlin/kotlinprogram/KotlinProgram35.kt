package kotlinprogram
fun main(){
    //single catch
    var number1 = 0
    var number2 = 0
    //exception handling - try and catch block
    try {
        println("***********************")
        println("Simple calculator")
        println("***********************")
        println("Enter number 1: ")
        number1 = readln().toInt()
        println("Enter number 2: ")
        number2 = readln().toInt()
        println("The quotient is ${number1/number2}")
    }catch (exception:Exception) {
        println("Wrong Input! Integer Inputs only!")
    }
    println("This is a test")
}
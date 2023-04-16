fun main() {
    var number: Int = 0

    println("Enter a number:")
    number = readln().toInt()

    if(number % 2 == 0){
        println("The number is even")
    }else {
        println("The number is odd")
    }

}
package practiceactivities

fun main() {
    var number: Int = 0

    println("Enter a number:")
    number = readln().toInt()

    if(number >=1){
        println("The number is positive")
    }else if(number == 0){
    println("The number is zero")
    }else {
        println("The number is negative")
    }

}
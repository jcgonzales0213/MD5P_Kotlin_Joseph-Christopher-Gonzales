package practiceactivities

fun main() {
    var number = 0
    var factorial = 1
    var i = 1


    print("Enter a positive integer:")
    number = readln().toInt()

    do {
        factorial *= i
        i++
    } while (i <= number)

    println("The Factorial of $number is $factorial")
}
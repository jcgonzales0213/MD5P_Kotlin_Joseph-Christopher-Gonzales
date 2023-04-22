package practiceactivities

fun main () {
    //declare all variables
    var name: String = ""
    var currentYear: Int = 0
    var birthYear: Int = 0
    var age: Int = 0

    //input
    println("What is your name?")
    name = readln()
    println("Enter current year: ")
    currentYear = readln().toInt()
    println("Enter birth year: ")
    birthYear = readln().toInt()

    //process
    age = currentYear - birthYear

    //output
    println("$name, your age on $currentYear is $age")
}

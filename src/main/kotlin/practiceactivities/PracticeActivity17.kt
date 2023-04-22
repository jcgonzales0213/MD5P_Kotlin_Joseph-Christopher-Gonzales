package practiceactivities

fun main() {
    var sum = 0.0
    var count = 0

    while (count < 5) {
        print("Enter a number ${count + 1}: ")
        val number = readln().toDouble()
        sum += number
        count++
    }

    val average = sum / 5.0
    println("The average is $average")
}
//Create a kotlin program that will accept 5 number and display the average
//use readln - once
// use while loop


//output
//Enter number 1:
//6
//Enter number 2:
//6
//Enter number 3:
//6
//Enter number 4:
//6
//Enter number 5:
//6

//The average is 6
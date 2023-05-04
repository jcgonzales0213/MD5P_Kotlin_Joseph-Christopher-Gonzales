package practiceactivities
fun main() {
    print("Enter a string: ")
    val input = readln()

    val stringLength = input.length
    val stringSize = stringLength - 1
    var reverseString = ""

    for (i in 0..stringSize){
        reverseString += input[stringLength - i - 1]
    }

    println("Normal and Reversed String: ")
    println(input)
    println(reverseString)
}




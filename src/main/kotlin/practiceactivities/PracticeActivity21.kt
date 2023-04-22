package practiceactivities

fun main(){
    //outer loop
    var number = 1
    while (number <= 5) {
        //inner loop
        var number2 = 1
        while (number2 <= number) {
            print("$number2 ")
            number2++
        }
        println()
        number++
    }
}
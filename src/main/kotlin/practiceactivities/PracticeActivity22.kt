package practiceactivities

fun main(){
    //outer loop
    var number = 5
    while (number > 0) {
        //inner loop
        var number2 = number
        while (number2 > 0) {
            print("* ")
            number2 -= 1
        }
        println()
        number -= 1
    }
}
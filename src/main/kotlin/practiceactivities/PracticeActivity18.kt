package practiceactivities

fun main() {
    var number = 0

    print("Enter a positive integer: ")
    number = readln().toInt()


    repeat(number) {
        if (it % 2 == 1) {
            println(it)
        }
    }
}


package practiceactivities

fun main() {
    // outer loop
    for (i in 25 downTo  21) {
        // inner loop
        for (j in 0 until 5) {
            // print the number
            print("${i-j*5}\t")
        }
        // move to the next line
        println()
    }
}

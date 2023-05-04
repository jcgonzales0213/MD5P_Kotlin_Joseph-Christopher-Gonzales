package practiceactivities
fun main() {
    print("Enter a string: ")
    val str = readln()
    print("Enter a character: ")
    val ch = readln()[0]

    val charCount = countOccurence(str, ch)
    println("Character count: $charCount")
}
fun countOccurence(str: String, ch: Char): Int {
    var count = 0
    for (c in str) {
        if (c == ch) {
            count++
        }
    }
    return count
}
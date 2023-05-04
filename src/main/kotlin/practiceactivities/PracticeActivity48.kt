package practiceactivities
fun main() {
    print("Enter a string: ")
    val str = readln()
    print("Enter a character: ")
    val ch = readln()[0]

    val charCount = str countOccurenceOf ch
    println("Character count: $charCount")
}
infix fun String.countOccurenceOf(ch: Char): Int {
    var count = 0
    for (c in this) {
        if (c == ch) {
            count++
        }
    }
    return count
}
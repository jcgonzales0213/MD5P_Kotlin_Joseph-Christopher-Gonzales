package practiceactivities


fun main() {
    print("Enter a string: ")
    val input = readln()
    val wordCount = countWords(input)
    println("Number of words: $wordCount")
}

fun countWords(text: String): Int {
    val words = text.trim().split("\\s+".toRegex())
    return words.size
}
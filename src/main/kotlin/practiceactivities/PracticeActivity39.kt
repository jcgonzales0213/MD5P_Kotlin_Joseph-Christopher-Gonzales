package practiceactivities


fun main() {
    print("Enter a Text: ")
    val text = readln()
    val reversedText = reverseString(text)
    println(reversedText)
}
fun reverseString(str: String): String {
    return str.reversed()
}
package kotlinactivity
fun main() {
    println("Enter a string:")
    val input = readln().trim()

    if (isPalindrome(input)) {
        println("Palindrome")
    } else {
        println("Not Palindrome")
    }
}

fun isPalindrome(str: String?): Boolean {
    if (str == null) return false

    val cleanStr = str.replace("\\s".toRegex(), "").lowercase()
    val length = cleanStr.length
    val halfLength = length / 2

    for (i in 0 until halfLength) {
        if (cleanStr[i] != cleanStr[length - i - 1]) {
            return false
        }
    }

    return true
}

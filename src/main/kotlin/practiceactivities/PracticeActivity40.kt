package practiceactivities
fun main() {
    print("Enter a word:")
    val word = readln()

    val word2 = removeDuplicates(word)
    println("Word after removing duplicate characters: $word2")
}

fun removeDuplicates(word: String): String {

    val uniqueChars = mutableSetOf<Char>()
    val result = StringBuilder()
    for (char in word) {
        if (uniqueChars.add(char)) {
            result.append(char)
        }
    }

    return result.toString()
}

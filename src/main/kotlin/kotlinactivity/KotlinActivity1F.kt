package kotlinactivity
fun main () {
    print("Enter String 1: ")
    val string1 = readln()
    print("Enter String 2: ")
    val string2 = readln()

    val uniqueCharacters = getUniqueCharacters(string1, string2)
    println("Unique: $uniqueCharacters")
}

fun getUniqueCharacters(string1: String?, string2: String?): String {
    val charSet = mutableSetOf<Char>()

    string1?.let {
        for (char in it) {
            if (!charSet.contains(char)) {
                charSet.add(char)
            }
        }
    }

    string2?.let {
        for (char in it) {
            if (!charSet.contains(char)) {
                charSet.add(char)
            }
        }
    }

    return charSet.joinToString("")
}










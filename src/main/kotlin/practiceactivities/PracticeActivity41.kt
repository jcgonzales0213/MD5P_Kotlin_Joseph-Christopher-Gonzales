package practiceactivities

fun main() {
    print("Enter a string: ")
    val inputString = readln()
    val stringWithoutSpaces = replaceSpaces(inputString)
    println("String with spaces replaced: $stringWithoutSpaces")
}
fun replaceSpaces(str:String):String{
    var replace = str.replace(" ","_")
    return replace
}
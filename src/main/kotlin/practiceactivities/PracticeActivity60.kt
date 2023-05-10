package practiceactivities
fun main() {
    val numbers = mutableListOf<Int>()
    repeat(5){
        print("Enter number ${it+1}: ")
        numbers.add(readln().toInt())
    }
    val result = applyHigherOrderFunction(numbers) { n -> "Number: $n" }
    println(result)
}

fun applyHigherOrderFunction(numbers: List<Int>, transform: (Int) -> String): List<String> {
    val transformedList = mutableListOf<String>()
    for (number in numbers) {
        val transformedValue = transform(number)
        transformedList.add(transformedValue)
    }
    return transformedList
}

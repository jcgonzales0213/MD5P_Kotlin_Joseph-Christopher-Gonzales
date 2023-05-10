package practiceactivities
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)

    try {
        println("Enter an index:")
        val index = readln().toInt()

        val element = array[index]
        println("Element at index $index is $element")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: Index out of bounds. Please enter an index between 0 and 4.")
    } finally {
        println("Program execution completed.")
    }
}

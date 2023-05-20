package kotlinactivity
fun main() {
    println("Enter number 1:")
    val number1 = readln().toIntOrNull()
    println("Enter number 2:")
    val number2 = readln().toIntOrNull()

    if (number1 != null && number2 != null) {
        val lower = if (number1 < number2) number1 else number2
        val higher = if (number1 > number2) number1 else number2

        println("Lowest is $lower")
        println("Highest is $higher")

        println("Prime numbers between $lower and $higher are:")
        for (num in lower..higher) {
            if (isPrime(num)) {
                print("$num ")
            }
        }
    } else {
        println("Invalid input. Please enter valid integers.")
    }
}

fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

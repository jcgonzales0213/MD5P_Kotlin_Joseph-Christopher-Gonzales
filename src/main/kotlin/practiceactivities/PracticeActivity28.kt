package practiceactivities

fun main() {
    val fahrenheit = 0.0
    val celsius = 0.0
    val mainMenu = mapOf("a" to "Celsius to Fahrenheit", "b" to "Fahrenheit to Celsius", "c" to "Exit")

    var option =""

    do {
        println("Main Menu")
        mainMenu.forEach { (key, value) -> println("$key. $value") }
        print("Choose option [a, b, or c]: ")
        option = readln()

        when (option) {
            "a"-> {
                if (option == "a") println("Celsius - Fahrenheit Conversion")
                print("Enter celsius: ")
                val fahrenheit = (9.0 / 5.0) * celsius + 32.0
                println("Fahrenheit equivalent is $fahrenheit")
            }
            "b" -> {
                if (option == "b") println("Fahrenheit - Celsius Conversion")
                print("Enter fahrenheit: ")
                val celsius = (fahrenheit - 32.0)*5.0/9.0
                println("Celsius equivalent is $celsius")
            }
            "c" -> {
                println("End of program. Good bye!")
            }
            else -> {
                println("Invalid option. Please choose a valid option.")
            }
        }
    } while (option != "c")
}



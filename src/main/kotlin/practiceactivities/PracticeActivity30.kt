package practiceactivities
fun main (){
    val phoneBook = mapOf("Alice" to "555-1234", "Bob" to "555-5678", "Charlie" to "555-9101")

    print("What is the name?: ")
    val name = readln()

    for ((key, value)in phoneBook){
        if(name == key) {
            println("$key's phone number is $value.")
        }
    }
}


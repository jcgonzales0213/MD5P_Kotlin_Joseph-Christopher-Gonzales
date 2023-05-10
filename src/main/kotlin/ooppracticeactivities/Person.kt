package ooppracticeactivities

class Person(val name: String, val age: Int, val email: String) {

    fun printDetails() {

        println("Name: $name")
        println("Age: $age")
        println("Email: $email")
    }
}
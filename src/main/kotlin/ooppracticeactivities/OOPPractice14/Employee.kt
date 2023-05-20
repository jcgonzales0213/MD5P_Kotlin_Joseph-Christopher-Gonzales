package ooppracticeactivities.OOPPractice14

open class Employee(val name: String, val age: Int) {
    open fun displayInfo() {
        println("Name: $name")
        println("Age: $age")
    }
}
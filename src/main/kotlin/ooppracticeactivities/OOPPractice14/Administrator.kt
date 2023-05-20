package ooppracticeactivities.OOPPractice14

class Administrator(name: String, age: Int, val department: String) : Employee(name, age) {
    override fun displayInfo() {
        super.displayInfo()
        println("Role: Administrator")
        println("Department: $department")
    }
}

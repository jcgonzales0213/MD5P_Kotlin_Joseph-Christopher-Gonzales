package ooppracticeactivities.OOPPractice14

class Teacher(name: String, age: Int, val subject: String) : Employee(name, age) {
    override fun displayInfo() {
        super.displayInfo()
        println("Role: Teacher")
        println("Subject: $subject")
    }
}

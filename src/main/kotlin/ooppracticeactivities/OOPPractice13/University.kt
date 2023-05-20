package ooppracticeactivities.OOPPractice13

class University(val universityName: String) {
    inner class Student(val name: String,val id: Int) {
        fun displayDetails() {
            println("University: $universityName")
            println("Student Name: $name")
            println("Student ID: $id")
        }
    }
}



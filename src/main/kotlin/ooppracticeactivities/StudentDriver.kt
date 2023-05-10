package ooppracticeactivities
fun main(){
    val student = Student("JC",19,11)
    println("Initial grade: ${student.grade}")

    student.promote()
    println("Promoted grade: ${student.grade}")
}
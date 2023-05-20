package ooppracticeactivities.OOPPractice15
fun main() {
    val fullTimeEmployee = FullTimeEmployee(50000.0)
    println("Full time employee's salary: ${fullTimeEmployee.calculateEarnings()}")

    val partTimeEmployee = PartTimeEmployee(500.0, 20.0)
    println("Part time employee's salary: ${partTimeEmployee.calculateEarnings()}")
}

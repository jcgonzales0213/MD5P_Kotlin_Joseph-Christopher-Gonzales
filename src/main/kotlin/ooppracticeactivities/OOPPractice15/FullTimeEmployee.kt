package ooppracticeactivities.OOPPractice15

class FullTimeEmployee(private val monthlySalary: Double) : Employee() {
    override fun calculateEarnings(): Double {
        return monthlySalary
    }

}
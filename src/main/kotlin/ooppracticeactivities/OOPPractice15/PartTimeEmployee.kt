package ooppracticeactivities.OOPPractice15

class PartTimeEmployee(private val hourlyRate: Double, private val hoursWorked: Double) : Employee() {
    override fun calculateEarnings(): Double {
        return hourlyRate * hoursWorked
    }

}
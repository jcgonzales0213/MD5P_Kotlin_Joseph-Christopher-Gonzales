package ooppracticeactivities.OOPPractice16

class Car : Vehicle() {
    override fun start() {
        println("The car is starting.")
    }

    override fun stop() {
        println("The car is stopping.")
    }

    override fun accelerate() {
        println("The car is accelerating.")
    }
}

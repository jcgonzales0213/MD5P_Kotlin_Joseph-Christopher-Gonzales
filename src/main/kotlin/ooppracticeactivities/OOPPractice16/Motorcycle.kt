package ooppracticeactivities.OOPPractice16

class Motorcycle : Vehicle() {
    override fun start() {
        println("The motorcycle is starting.")
    }

    override fun stop() {
        println("The motorcycle is stopping.")
    }

    override fun accelerate() {
        println("The motorcycle is accelerating.")
    }
}
package ooppracticeactivities.OOPPractice16

abstract class Vehicle {
    var brand: String = ""
    var year: Int = 0

    abstract fun start()
    abstract fun stop()

    open fun accelerate() {
        println("The vehicle is accelerating.")
    }
}
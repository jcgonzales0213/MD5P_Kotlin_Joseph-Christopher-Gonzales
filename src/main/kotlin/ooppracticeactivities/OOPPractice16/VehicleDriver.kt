package ooppracticeactivities.OOPPractice16
fun main() {
    val car = Car()
    car.brand = "Toyota"
    car.year = 2023
    println("Car Brand:${car.brand}")
    println("Year released:${car.year}")
    car.start()
    car.accelerate()
    car.stop()

    println("***************************")

    val motorcycle = Motorcycle()
    motorcycle.brand = "Kawasaki"
    motorcycle.year = 2022
    println("Car Brand:${motorcycle.brand}")
    println("Year released:${motorcycle.year}")
    motorcycle.start()
    motorcycle.accelerate()
    motorcycle.stop()
}
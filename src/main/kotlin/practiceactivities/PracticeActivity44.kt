package practiceactivities

fun main(){
    //variables
    var fahrenheit = 0.0
    var celsius = 0.0

    //input
    print("Temperature(Celsius): ")
    celsius = readln().toDouble()

    //process
    fahrenheit = convertTemperature(celsius)

    //output
    println("Temperature(Fahrenheit): ${String.format("%.2f",fahrenheit)}")
}
fun convertTemperature(celsius:Double):Double{
    val fahrenheit = (celsius * 9 / 5) + 32
    return fahrenheit
}
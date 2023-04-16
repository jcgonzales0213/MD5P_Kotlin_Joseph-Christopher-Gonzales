fun main () {
    //declare all variables
    var length: Double = 0.0
    var width: Double = 0.0
    var perimeter: Double = 0.0
    var area: Double = 0.0
   
    //input
    println("Enter length: ")
    length   = readln().toDouble()
    println("Enter width: ")
    width    = readln().toDouble()

    //process
    perimeter = 2*(length+width)
    area = width * length


    //output
    println("Perimeter is $perimeter meters")
    println("Area is ${String.format("%.2f",area)} meters")

}
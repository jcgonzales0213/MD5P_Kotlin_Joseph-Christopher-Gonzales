package practiceactivities
fun main () {
    //declare all variables
    var length = 0.0
    var width = 0.0
    var perimeter = 0.0
    var area = 0.0

    //input
    println("Enter length: ")
    length = readln().toDouble()
    println("Enter width: ")
    width = readln().toDouble()

    //process
    perimeter = calculatePerimeter(length, width)
    area = calculateArea(length,width)


    //output
    println("Perimeter is $perimeter meters")
    println("Area is ${String.format("%.2f", area)} meters")

}
fun calculatePerimeter(length1:Double,width1:Double):Double{
    val perimeter = 2 * (length1 + width1)
    return perimeter
}
fun calculateArea(length2:Double,width2:Double):Double{
    val area = length2 * width2
    return area
}
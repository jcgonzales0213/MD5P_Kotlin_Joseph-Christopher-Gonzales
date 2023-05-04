package practiceactivities
fun main () {
    //declare all variables
    var length = 0.0
    var width = 0.0
    var perimeter = 0.0
    var area = 0.0

    //input
    print("Enter length: ")
    length = readln().toDouble()
    print("Enter width: ")
    width = readln().toDouble()

    //process
    perimeter = length calculatePerimeter width
    area = length calculateArea width


    //output
    println("Perimeter is $perimeter meters")
    println("Area is ${String.format("%.2f", area)} meters")

}
infix fun Double.calculatePerimeter(width:Double):Double{
    return 2 * (this + width)
}
infix fun Double.calculateArea(width:Double):Double{
    return this * width
}
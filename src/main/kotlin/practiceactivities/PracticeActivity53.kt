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
    perimeter = { l: Double, w: Double -> 2 * (l + w) }(length, width)
    area = { l: Double, w: Double -> l * w }(length, width)


    //output
    println("Perimeter is $perimeter meters")
    println("Area is ${String.format("%.2f", area)} meters")

}

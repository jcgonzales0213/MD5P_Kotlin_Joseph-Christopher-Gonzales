package ooppracticeactivities
fun main(){
    val rectangle = Rectangle(4.5,6.7)
    val area = rectangle.calculateArea()
    println("The area of the rectangle is: ${String.format("%.2f",area)}")
}
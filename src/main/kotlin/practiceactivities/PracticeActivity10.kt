package practiceactivities

fun main(){
    //declare all variables
    var product : String = ""
    var price : Double = 0.0
    var discount : Double = 0.0
    var netPrice : Double = 0.0
    var percentage : Double = 0.0

    //input
    println("Enter product:")
    product = readln()
    println("Enter price:")
    price = readln().toDouble()

    if (price >= 100001.0){
        percentage = 0.20
    }else if(price >= 50001.0){
        percentage = 0.15
    }else if(price >= 20001.0){
        percentage = 0.10
    }else if(price >= 10001.0){
        percentage = 0.05
    }else{
        percentage = 0.20
    }

    //process
    discount = price * percentage
    netPrice = price - discount

    //output
    println("Price of $product is ${String.format("%.2f",price)}")
    println("Discount is ${String.format("%.2f",discount)}")
    println("Net Price is ${String.format("%.2f",netPrice)}")

}
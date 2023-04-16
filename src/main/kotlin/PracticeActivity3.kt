fun main () {
    //declare all variables
    var item = ""
    var price1: Double = 0.0
    var price2: Double = 0.0
    var price3: Double = 0.0
    var averagePrice: Double = 0.0

    //input
    println("Enter item: ")
    item = readln()
    println("Price in Day 1: ")
    price1 = readln().toDouble()
    println("Price in Day 2: ")
    price2 = readln().toDouble()
    println("Price in Day 3: ")
    price3 = readln().toDouble()


    //process
    averagePrice = (price1 + price2 + price3) / 3


    //output
    println("Average price of $item is ${String.format("%.2f",averagePrice)}")
}
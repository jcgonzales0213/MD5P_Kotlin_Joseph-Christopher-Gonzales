package practiceactivities

fun main () {
    //declare all variables
    var name: String = ""
    var unitsEnrolled: Int = 0
    var pricePerUnit: Double = 0.0
    var computedTuitionFee: Double = 0.0
    var cashPayment : Double = 0.0
    var installment2 : Double = 0.0
    var installment3 : Double = 0.0


    //input
    println("Enter name of student:")
    name = readln()
    println("Enter number of units enrolled:")
    unitsEnrolled = readln().toInt()
    println("Enter price per unit:")
    pricePerUnit = readln().toDouble()

    //process
    computedTuitionFee = unitsEnrolled * pricePerUnit
    cashPayment = computedTuitionFee - (computedTuitionFee * .10)
    installment2 = computedTuitionFee + (computedTuitionFee * .05)
    installment3 = computedTuitionFee + (computedTuitionFee * .10)

    //output
    println("$name, you could avail the following payment mode:")
    println("Computed Tuition fee:${String.format("%.2f",computedTuitionFee)} dollars")
    println("Payment Mode:")
    println("Cash Payment:${String.format("%.2f",cashPayment)} dollars")
    println("2-installment:${String.format("%.2f",installment2)} dollars")
    println("3-installment:${String.format("%.1Gf",installment3)} dollars")
}
fun main(){
    //declare all variables
    var fare : Double = 0.0
    var type : Char = 'x'
    var businessClass : Char = 'Y'
    var discount : Double = 0.0
    var businessClassCharge : Double = 0.0
    var newFare :Double =0.0
    var percentage : Double = 0.0


    //input
    println("Enter fare:")
    fare = readln().toDouble()
    println("Passenger type[O,S,C]:")
    type = readln().first()
    println("Travelling in business class [Y/N]:")
    businessClass = readln().first()

    //process
    when(type){
        'S' ->{
            percentage = 0.05
            businessClassCharge = 700.0
        }
        'C' ->{
            percentage = 0.10
            businessClassCharge = 500.0
        }
        else ->{
            percentage = 0.0
            businessClassCharge = 1000.0
        }
    }
    discount = fare * percentage
    newFare = (fare + businessClassCharge) - discount

    //output
    println("Discount is $discount")
    if (businessClass == 'S'){
        println("Business class charge is $businessClassCharge ")
    }else if (businessClass == 'C'){
        println("Business class charge is $businessClassCharge ")
    }else {
        println("Business class charge is $businessClassCharge")
    }

    println("New Fare is $newFare")





}
fun main(){
    //declare all variables
    var name : String = ""
    var physics : Double = 0.0
    var algebra : Double = 0.0
    var programming : Double = 0.0
    var average : Double = 0.0

    //input
    println("Enter name:")
    name = readln()
    println("Enter grade in Physics:")
    physics = readln().toDouble()
    println("Enter grade in Algebra:")
    algebra = readln().toDouble()
    println("Enter grade in Programming:")
    programming = readln().toDouble()

    //process
    average = (physics+algebra+programming)/3


    //output
    println("$name average grade is ${String.format("%.2f",average)}")

    if (average > 100 ) {
        println("Invalid grade")
    }else if(average >= 95 ){
        println("President lister")
    }else if(average >= 89){
        println("Dean lister")
    }else if(average >= 83){
        println("Average Student")
    }else if(average >= 78) {
        println("Fair")
    }else{
        println("Failure")
    }

}
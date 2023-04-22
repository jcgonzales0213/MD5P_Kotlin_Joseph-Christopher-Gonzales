package practiceactivities

fun main(){
    //declare all variables
    var year : Int = 0
    var condition1 : Boolean = false
    var condition2 = false


    //input
    println("Enter a year:")
    year = readln().toInt()


    //process
    condition1 = year % 4 == 0
    condition2 = year % 100 != 0 || year % 400 == 0


    //output
    if( condition1 && condition2 ){
        println("$year is a leap year")
    }else{
        println("$year is not a leap year")
    }

}
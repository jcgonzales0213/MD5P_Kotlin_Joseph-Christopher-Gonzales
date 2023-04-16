fun main(){
    //declare all variables
    var year : Int = 0

    //input
    println("Enter a year:")
    year = readln().toInt()


    //output
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        println("$year is a leap year")
    }else{
        println("$year is not a leap year")
    }

}
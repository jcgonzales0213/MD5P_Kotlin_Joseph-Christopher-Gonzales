package practiceactivities

fun main (){
    var number = 0


    print("Enter a number:")
    number = readln().toInt()

    //for loop
    for (i in 1..10){
        println("$number x $i = ${number * i}")
    }

}


package practiceactivities
fun main(){
    println("Enter the number of eggs: ")
    val eggCount = readln().toInt()
    if (eggCount != 0){
        val dozenCount = determineDozen(eggCount)
        val lessDozenCount = showLessDozen(eggCount)
        println("Number of dozen: $dozenCount")
        println("Eggs less than a dozen: $lessDozenCount")
    }else {
        println("Invalid input!")
    }
}

fun determineDozen(eggCount:Int):Int{
    val dozenCount = eggCount /12
    return dozenCount
}
fun showLessDozen(eggCount:Int):Int{
    val lessDozenCount = eggCount % 12
    return lessDozenCount
}
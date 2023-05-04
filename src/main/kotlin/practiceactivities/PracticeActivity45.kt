package practiceactivities
fun main(){
    print("Enter a positive integer: ")
    val n = readln().toInt()

    if (n < 0){
        println("Error: Invalid input. Please enter a positive integer!")
    }else{
        val factorial = findFactorial(n)
        println("Factorial: $factorial")
    }
}
fun findFactorial(n:Int):Int{
     var result = 1
    for (i in 1..n){
        result *= i
    }
    return result
}
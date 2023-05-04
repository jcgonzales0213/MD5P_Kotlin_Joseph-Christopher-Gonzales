package practiceactivities
fun main (){
    print("Enter a string: ")
    val input = readln().lowercase()
    var count = 0

    for (char in input){
        if (char in "aeiou"){
            count++
        }
    }
    println("Number of vowels in the string: $count")
}




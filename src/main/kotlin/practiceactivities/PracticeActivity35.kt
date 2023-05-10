import kotlin.time.measureTime

//package practiceactivities
//fun main (){
//        val matrix = mutableListOf<Int>()
//    //accept 9 number from the user
//    for (i in 1..9)
//        println("Enter number $i: ")
//        val number = readln().toInt()
//        matrix.add(readln().toInt())
//        }
//
//    var index = 0
//    repeat(3){ row->
//    repeat(3) { col ->
//        print("${matrix[index]}\t")
//        index++
//    }
//    println()
//}
//}
fun main (){

    val matrix = mutableListOf(mutableListOf<Int>(0,0,0),mutableListOf<Int>(0,0,0),mutableListOf<Int>(0,0,0))
    var row = 0
    var i = 1
    while (row < matrix.size){
        var column = 0
        while (column < matrix[row].size){
          print("Enter number $i: ")
          matrix[row][column] = readln().toInt()
          column++
          i++
        }
        row++

    }
    row = 0
    while (row < matrix.size){
        var column = 0
        while (column < matrix[row].size){
            print("${matrix[row][column]} \t")
            column++
        }
        row++
        println()
    }
}


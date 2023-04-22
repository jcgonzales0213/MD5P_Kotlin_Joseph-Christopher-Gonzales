package practiceactivities

fun main(){
    var numbers = ArrayList<Int>()
    var count = 0
    print("enter number 1: ")
    numbers.add(readln().toInt())
    print("enter number 2: ")
    numbers.add(readln().toInt())
    print("enter number 3: ")
    numbers.add(readln().toInt())
    print("enter number 4: ")
    numbers.add(readln().toInt())
    print("enter number 5: ")
    numbers.add(readln().toInt())

    var ctr = 0
    while (ctr < numbers.size) {
        if (numbers[ctr] % 2 == 0) {
            count++
        }
        ctr++
    }
    println("The number of even numbers are: $count")
}
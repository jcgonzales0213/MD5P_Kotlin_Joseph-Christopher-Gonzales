package kotlinprogram

fun main(){
    //set - immutable
    var numbers = setOf<Int>(1,3,5,7)
    println(numbers.elementAt(0))


    var ctr = 0
    while (ctr < numbers.size) {
        println(numbers.elementAt(ctr))
        ctr++
    }

    println("****************")
    //mutable
    var numbers2 = mutableSetOf<Int>(1,3,5,7)
    numbers2.add(6)
    numbers2.remove(3)

    var ctr2 = 0
    while (ctr2 < numbers.size) {
        println(numbers.elementAt(ctr2))
        ctr2++
    }

}
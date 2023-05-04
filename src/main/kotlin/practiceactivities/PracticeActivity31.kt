package practiceactivities
fun main (){
    val setA = mutableSetOf<Int>()
    val setB = mutableSetOf<Int>()
    var counter1 = 0
    var counter2 = 0



    println("Values for set A")
    while (counter1 < 5){
        print("Enter number ${counter1+1}: ")
        setA.add(readln().toInt())
        counter1++
    }

    println("Values for set B")
    while (counter2 <5){
        print("Enter number ${counter2+1}: ")
        setB.add(readln().toInt())
        counter2++
    }
    val intersection = setA.intersect(setB)
    println("Intersection of the sets: $intersection")
}
package kotlinprogram

fun main (){
    //only strings
    var names = arrayOf<String>("paul","john","ringo","george")
    //any data type
    //var names = arrayOf("paul","john","ringo",123)
    println("array size is ${names.size}")

    var ctr = 0
    while (ctr < names.size){
        println(names[ctr])
        ctr++
    }
}
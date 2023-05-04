package kotlinprogram

import kotlin.concurrent.fixedRateTimer

fun main (){
    //maps - key - value pair structure immutable
    //<key> to <value>
    //traverse
    var fruits = mapOf('a' to "apple", 'b' to "banana", 'c' to "grapes")
    println(fruits['b'])
    println(fruits)

    for ((key, value)in fruits){
        println(" Key is $key and Value is $value")
    }

    var fruits2 = mutableMapOf<Int, String>()
    //old way
    //fruits2.put(1,"Melon")
    //new way
    fruits2[1] = "Melon"
    fruits2[2] = "Watermelon"
    fruits2[5] = "Papaya"
    println(fruits2)
    fruits2.remove(2)
    fruits2.replace(5,"Tamarind")
    println(fruits2)
}
package kotlinprogram

fun main (){
    //outerloop
    var ctr1 = 0
    while(ctr1 < 3){
        //innerloop
        var ctr2 = 0
        while(ctr2 < 5){
            print("*")
            ctr2++
        }
        println()
        ctr1++
    }
}
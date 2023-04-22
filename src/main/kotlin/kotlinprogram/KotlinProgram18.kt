package kotlinprogram

fun main () {
    // while loop
    //1 : loop variable
    var counter = 0
    //2 : Condition
    while (counter < 5) {
        if (counter ==3){
            continue
        }
        println("Riecho!")
        // body...

        //3 : update
        counter++
    }
    println("Hello World!")
}
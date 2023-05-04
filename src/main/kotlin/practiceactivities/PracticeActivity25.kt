fun main(){
    print("Enter base size of dollar triangle: ")
    var baseSize = readln().toInt()

    var spaces = baseSize - 1
    var dollars = 1

    //outer loop
    for (i in 1..baseSize) {
        //inner loop
        repeat(spaces) {
            print(" ")
        }
        repeat(dollars){
            print("$")
        }
        println()
        spaces--
        dollars++
    }
}
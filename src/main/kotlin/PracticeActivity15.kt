fun main(){
    //declare all variables
    var a : Int = 0
    var b : Int = 0
    var c : Int = 0

    //input
    println("Enter number 1:")
    a = readln().toInt()
    println("Enter number 2:")
    b = readln().toInt()
    println("Enter number 3:")
    c = readln().toInt()



    //output
    if((a * a) + (b * b) == (c*c) || ((a *a) +(c*c) == (b*b) || (b*b) + (c*c) ==(a*a))){
        println("The numbers form a Pythagorean Triple")
    }else{
        println("The number do not form a Pythagorean Triple")
    }

}
fun main(){
    var age : Int = 18
    //18 pataas - display
    //17 pababa - does not display
    // < > <= >= == !=

    println("Please Enter your age:")
    age = readln().toInt()

    if(age >=18){
        println("Your age is $age")
        println("You are qualified to vote!")
    }else{
        println("Your age is $age")
        println("Not qualified to vote!!!!!")
    }
    println("This will always execute!")
}
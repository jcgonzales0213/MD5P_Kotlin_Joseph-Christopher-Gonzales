fun main(){
    //if else statement
    // grade 90 - 100 -> A
    // grade 80 - 89 -> B
    // grade 70 - 79 -> C
    // grade 60 - 69 -> D
    // less than 60 -> F
    var grade : Int = 0
    // < > <= >= == !=
    println("Enter your exam score (out of 100):")
    grade = readln().toInt()


    if (grade >= 90){
        println("Your grade is A")
    }else if(grade >= 80){
        println("Your grade is B")
    }else if(grade >= 70){
        println("Your grade is C")
    }else if(grade >= 60) {
        println("Your grade is D")
    }else {
        println("Your grade is F")
    }
}
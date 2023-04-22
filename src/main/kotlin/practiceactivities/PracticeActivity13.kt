package practiceactivities

fun main(){
    //declare all variables
    var weight : Double = 0.0
    var height : Double = 0.0
    var bmi : Double = 0.0


    //input
    println("Enter your weight (in kg):")
    weight = readln().toDouble()
    println("Enter your height (in meters):")
    height = readln().toDouble()


    //process
    bmi = weight / (height * height)


    //output
    if (bmi >= 30.0){
        println("Your BMI is ${String.format("%.2f",bmi)}, which is in the Obese range")
    }else if(bmi >= 25.0){
        println("Your BMI is ${String.format("%.2f",bmi)}, which is in the Overweight range")
    }else if(bmi >= 18.5){
        println("Your BMI is ${String.format("%.2f",bmi)}, which is in the Normal weight range")
    }else{
        println("Your BMI is ${String.format("%.2f",bmi)}, which is in the Underweight range")
    }

}
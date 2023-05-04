package practiceactivities
fun main() {
    //declare all variables
    var weight: Double = 0.0
    var height: Double = 0.0
    var bmi: Double = 0.0


    //input
    print("Weight(kg): ")
    weight = readln().toDouble()
    print("Height(m): ")
    height = readln().toDouble()


    //process
    bmi = calculateBmi(weight,height)

    //output
    println("BMI: ${String.format("%.2f",bmi)}")
}
fun calculateBmi(weight2:Double,height2:Double):Double{
    var result = weight2 / (height2 * height2)
    return result
}
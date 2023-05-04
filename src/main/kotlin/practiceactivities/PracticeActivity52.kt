package practiceactivities
fun main(){

    val numbers = arrayListOf<Double>()
    var average = 0.0
    //input
    repeat(5){Double
        print("Enter number ${it+1}: ")
        numbers.add(readln().toDouble())
    }

    //process
    average = computeAverage(numbers)


    //output
    println("Average: ${String.format("%.2f",average)}")
}

val computeAverage= {numbers:List<Double> ->
    if (numbers.isEmpty()){
        0.0
    }else {
        numbers.sum() / numbers .size
    }

}
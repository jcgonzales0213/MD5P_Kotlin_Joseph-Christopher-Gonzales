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

fun computeAverage(vararg numbers: Double): Double {
    if (numbers.isEmpty()) {
        return 0.0
    }

    var sum = 0.0
    for (number in numbers) {
        sum += number
    }
    val average = sum / numbers.size
    return average
}


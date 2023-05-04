package practiceactivities


fun main(){
    var numbers = ArrayList<Int>()

    repeat(5){
        print("Enter number ${it+1}: ")
        numbers.add(readln().toInt())
    }

    var max = numbers[0]
    var min = numbers[0]
    var ctr = 0
    while (ctr < numbers.size) {
        if (numbers[ctr] > max) {
            max = numbers[ctr]
        }
        if (numbers[ctr] < min) {
            min = numbers[ctr]
        }
        ctr++
    }
    println("Max value is : $max")
    println("Min value is : $min")
}


package practiceactivities
fun main() {
    var number = 0
    var squareOfNumber = 0

    print("Enter matrix to generate (n by n): ")
    number= readln().toInt()

    squareOfNumber = number * number

    var line = number
    while (squareOfNumber > 0){

        var ctr = 0
        var showOutput = ""
        while (ctr < number){

            if (line % 2 == 0){
                if (showOutput != "") showOutput = showOutput + "\t"
                showOutput = showOutput + squareOfNumber
            }
            else {
                if (showOutput != "") showOutput = "\t" + showOutput
                showOutput = squareOfNumber.toString() + showOutput
            }
            ctr++
            squareOfNumber--
        }
        line--
        println(showOutput)
    }
}


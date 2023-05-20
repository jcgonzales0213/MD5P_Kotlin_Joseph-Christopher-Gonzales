package kotlinactivity
fun main() {
    //variables declaration
    val cars = arrayOf("Toyota,Honda ,Mitsubishi , Nissan , Jeep, BMW")

    println("My favorite car brands are: ")
    for (i in 0..cars.size - 1){
        println(cars[i])
    }


    val pcParts = arrayListOf<String>("Motherboard, GPU, RAM stick, AIO, PSU, CPU")
    println("Building a PC List: $pcParts")


    val cellphoneBrand = setOf<String>("Apple, Samsung, Realme, Oppo")
    println("The top Cellphone brands are $cellphoneBrand")

    val studentAges = mapOf(
        "John" to 20,
        "Sarah" to 22,
        "Michael" to 19,
        "Emily" to 21
    )


    for ((name, age) in studentAges) {
        println("$name is $age years old")
    }
}
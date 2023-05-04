package kotlinprogram
fun main(){
    //default parameter values

    displayName("Joe" , 7)
}
fun displayName(name:String = "Unknown" , numberOfTimes: Int = 3){
    repeat(numberOfTimes){Int
        println("Hello $name")
    }
}
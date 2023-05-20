package kotlinoop.kotlinoop7

class Outer {

    //Nested class
    //In a nested class,the inner class cannot access the properties and behaviors of the outer class
    val outerClassName = "Outer name"

    class Inner{
        fun callOuter(){
            println("Not Possible")
        }
    }
}
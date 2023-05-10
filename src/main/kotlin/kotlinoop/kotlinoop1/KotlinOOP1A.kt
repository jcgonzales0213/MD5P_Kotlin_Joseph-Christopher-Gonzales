package kotlinoop.kotlinoop1
//OOP
//objects
//structural programming, procedural programming
 //-top to bottom

//Personal class
/////////attributes/properties
//name
//age
/////////behaviors
//walk
//eat
class Person{
    //attributes
    var name : String
    var age: Int

    //init block, initialization
    init {
        name="Pedro"
        age= 21
    }
    fun walk(){
        println("a person walks")
    }
    fun eat(){
        println("A person eats")
    }
    fun sayHello(){
        println("$name says Hello!")
    }
}
fun main(){
    // instantiation - creating objects from a class
    val pedroObject = Person()
    println(pedroObject.name)

    pedroObject.sayHello()
}

package kotlinoop.kotlinoop1
class Person1B(name:String, age: Int){  //constructor - for setting attribute values

    var name : String
    var age: Int

    //init block, initialization
    init {
        this.name= name
        this.age= age
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
    val pedroObject = Person1B("Ringo", 21)
    println(pedroObject.name)
    println(pedroObject.age)

    pedroObject.sayHello()
}

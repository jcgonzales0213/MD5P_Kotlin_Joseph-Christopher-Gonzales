package kotlinoop.kotlinoop8

//encapsulation/information hiding
//object variables/member variables are not accessed directly but they can be accessed via setter and getter function
//
//access modifiers - public and private
class Person {
    private var name : String = "no name"
    private var age: Int = 0

    fun sayHello(){
        println("$name says hello!")
    }

    fun getName():String{
        return name
    }
    fun setName(name:String){
        this.name = name
    }
    fun getAge():Int{
        return age
    }
    fun setAge(age:Int){
        if (age >= 0){
            this.age = age
        }else   {
            println("Invalid age value")
        }
    }
}
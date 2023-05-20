package ooppracticeactivities.OOPPractice7

class Person {
    var name: String
    var age: Int

    constructor(name:String){
        //primary constructor
        this.name = name
        this.age = 0
    }
    //secondary constructor
    constructor(name:String, age:Int) {
        this.name = name
        this.age = age
    }

}
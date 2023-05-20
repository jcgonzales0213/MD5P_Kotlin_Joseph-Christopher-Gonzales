package ooppracticeactivities.OOPPractice6

class Shape {
    var length : Double = 0.0
    var width : Double = 0.0

    constructor(){
        length = 0.0
        width  = 0.0
    }
    constructor(length : Double, width : Double){
        this.length = length
        this.width = width
    }
    fun getArea():Double{
        return length * width
    }

}
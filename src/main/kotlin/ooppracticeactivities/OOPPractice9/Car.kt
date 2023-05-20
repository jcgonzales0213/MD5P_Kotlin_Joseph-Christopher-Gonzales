package ooppracticeactivities.OOPPractice9

class Car{
    var make:String
    var model:String
    var year:Int

    constructor(make:String,model:String) {
        this.make=make
        this.model=model
        this.year=0
    }
    constructor(make:String,model:String,year:Int){
        this.make=make
        this.model=model
        this.year=year
    }
}
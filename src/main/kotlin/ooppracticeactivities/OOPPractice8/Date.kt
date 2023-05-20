package ooppracticeactivities.OOPPractice8

class Date {
    var day:Int
    var month:Int
    var year:Int

    //primary constructor
    constructor(){
        day = 1
        month = 1
        year = 1993

    }
    //secondary constructor
    constructor(day:Int, month:Int, year:Int){
        this.day = day
        this.month = month
        this.year = year
    }
}
package ooppracticeactivities.OOPPractice3

class Book(val title:String, val author:String, val year:Int) {
    fun printDetails(){
        println("Title of the book: $title")
        println("Author of the book: $author")
        println("Published on: $year")
    }
}
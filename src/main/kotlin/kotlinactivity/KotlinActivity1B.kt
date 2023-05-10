package kotlinactivity

fun main(){
    //books,magazine,newspapers,table games,films or dvds,

    //Books
    val classBooks = "001-099"
    val subjectBooks = "Religion"
    val locationBooks = 1


    println("Books")
    println("Classification \tSubject \tLocation")
    println("$classBooks \t\t$subjectBooks \t\t$locationBooks")

    //Magazine
    val classMagazine = "100-199"
    val subjectMagazine = "Sports"
    val locationMagazine = "1 Magazine"


    println("Magazine")
    println("Classification \tSubject \tLocation")
    println("$classMagazine \t\t$subjectMagazine \t\t$locationMagazine")

    //NewsPaper
    val newsPaperTitle = "Philippine Star"
    val locationNewsPaper = "NewsPaper Rack 1"

    println("Newspaper")
    println("Title \t\t\t\t\tLocation")
    println("$newsPaperTitle \t\t$locationNewsPaper")
}
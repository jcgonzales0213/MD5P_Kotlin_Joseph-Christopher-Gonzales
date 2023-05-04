package kotlinprogram
fun main(){

    //length
    val myText = "Hello World!"
    val stringLength = myText.length
    println(stringLength)

    //to lowercase and to uppercase
    val upperCase = myText.uppercase()
    val lowerCase = myText.lowercase()
    println(upperCase)
    println(lowerCase)

    //contains
    val searchText = "Hello"
    val result = myText.uppercase().contains(searchText.uppercase())
    println(result)

    //replace
    val replaceText = myText.replace("World","Kotlin")
    println(replaceText)

    //accessing by index
    println("${myText[0]} ${myText[11]}")
}
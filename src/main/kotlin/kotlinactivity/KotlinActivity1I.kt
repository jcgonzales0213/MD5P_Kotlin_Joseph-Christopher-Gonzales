package kotlinactivity
fun main() {
    // Books
    val books = arrayOf(
        Book("001-099", "Religion", 1, "Book 1"),
        Book("001-099", "Religion", 2, "Book 2"),
        Book("001-099", "Religion", 3, "Book 3")
    )

    // Borrowed Books
    val borrowedBooks = mutableListOf<BorrowedBook>()

    println("Available Books:")
    println("Classification \tSubject \tLocation")
    books.forEach {
        println("${it.classification} \t\t${it.subject} \t\t${it.location}")
    }

    // Borrow a Book
    val borrowerName = "John Doe"
    val bookToBorrow = books[0] // Assuming the first book is borrowed
    val loanDuration = 14 // Assuming 14 days loan duration

    borrowedBooks.add(BorrowedBook(borrowerName, bookToBorrow, loanDuration))
    println("\n$borrowerName borrowed '${bookToBorrow.title}' for $loanDuration days.")

    // Print Borrowed Books
    println("\nBorrowed Books:")
    println("Borrower \tBook Title \t\t\tLoan Duration")
    borrowedBooks.forEach {
        println("${it.borrower} \t\t${it.book.title} \t\t${it.loanDuration} days")
    }
}

data class Book(
    val classification: String,
    val subject: String,
    val location: Int,
    val title: String
)

data class BorrowedBook(
    val borrower: String,
    val book: Book,
    val loanDuration: Int
)

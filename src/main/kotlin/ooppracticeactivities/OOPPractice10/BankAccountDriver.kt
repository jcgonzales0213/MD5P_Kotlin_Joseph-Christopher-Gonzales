package ooppracticeactivities.OOPPractice10

fun main(){
    val bankAccount=BankAccount(489953023)
    println(bankAccount.accountNumber)
    println(bankAccount.balance)

    val bankAccount2 = BankAccount(489953023,5000.00)
    println(bankAccount2.accountNumber)
    println(bankAccount2.balance)
}
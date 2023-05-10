package ooppracticeactivities
fun main(){
    val account = BankAccount(123454898,5000.00)
    account.deposit(500.00)
    account.withdraw(300.00)
    account.withdraw(200.00)
    account.deposit(-100.00)

}
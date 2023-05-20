package ooppracticeactivities.OOPPractice10

class BankAccount {
    var accountNumber:Int
    var balance:Double


    constructor(accountNumber:Int){
        this.accountNumber=accountNumber
        this.balance=0.0
    }

    constructor(accountNumber: Int,balance:Double) {
        this.accountNumber = accountNumber
        this.balance=balance
    }
}
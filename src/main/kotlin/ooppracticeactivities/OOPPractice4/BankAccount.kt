package ooppracticeactivities.OOPPractice4

class BankAccount(val accountNumber:Int, var balance:Double) {
    fun deposit(amount:Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $amount. New balance: $balance")
        }else{
            println("Invalid deposit amount.")
        }
    }

    fun withdraw(amount:Double){
        if(amount >0){
            if (balance >= amount){
                balance -= amount
                println("Withdrawn $amount. New balance: $balance")
            }else {
                println("Insufficient funds. Cannot withdraw $amount. Current balance: $balance")
            }

        }else{
            println("Invalid withdrawal amount.")
        }
    }
}
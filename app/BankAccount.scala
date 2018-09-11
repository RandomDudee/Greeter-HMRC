package app

/**
  * Created by digital032746 on 11/09/18.
  */
class BankAccount { abstract class BankAccount(accountNumber : String, balance: Double){
  def withdraw(amount: Double) : BankAccount
  def deposit(amount: Double) : BankAccount
}


  final class SavingsAccount(accountNumber: String, balance: Double)
    extends BankAccount(accountNumber, balance){

    override def withdraw(amount: Double) = {
      new SavingsAccount(accountNumber, balance - amount)
    }

    override def deposit(amount: Double) = {
      new SavingsAccount(accountNumber, balance + amount)
    }
  }


  final class CashISASavingsAccount(accountNumber :String, balance: Double)
    extends BankAccount(accountNumber, balance){

    override def withdraw(amount: Double) = {
      if (amount > balance) {
        println("You cannot go overdrawn!")
      } else {
        new CashISASavingsAccount(accountNumber, balance - amount)
      }
      println("You cannot withdraw from this account!")
      this
    }

    override def deposit(amount: Double) = {
      new CashISASavingsAccount(accountNumber, balance + amount)
    }
  }



}

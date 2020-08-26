

object ChallangeBankAccount extends App {
  var acc1 = new BankAccount("Sam", 10000, "checking")
  var acc2 = new BankAccount("Ipsit", 10000, "saving")
  println(acc1)
  println(acc2)
}

class BankAccount(val clientName:String, val balance:Int, val accountType: String ){
   val accNumber:Int = BankAccount.generateAccNumber()
  override def toString = "client name: " + clientName +" acc Number: " + accNumber+ 
   " balance: $" + balance + (if(accountType == "checking") "checking" else "savings")  + ("\n" + "="*50)
}

object BankAccount {
   var accNumber:Int = 5000
   def generateAccNumber() ={
     accNumber+=1
     accNumber
     
   }
}
package objects.apply

/**
 * Created by chanwook on 2014. 7. 14..
 */
class Account private(val id: Int, initialBalance: Double) {

  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

}

object Account {

  def apply(initialBalance: Double) =
    new Account(newUniqueNumber(), initialBalance)


  private var lastNumber = 0;

  private def newUniqueNumber() = {
    lastNumber += 1;
    lastNumber
  }

}

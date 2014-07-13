package objects.companion

/**
 * Created by chanwook on 2014. 7. 14..
 */
class Account {

  val id = Account.newUniqueNumber()
  private var balance = 0.0

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

}

object Account {
  private var lastNumber = 0;

  private def newUniqueNumber() = {
    lastNumber += 1;
    lastNumber
  }
}

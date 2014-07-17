package traits.objwith

/**
 * Created by chanwook on 2014. 7. 17..
 */
class SavingAccount extends Account with Logged {

  def withdraw(amount: Double) {
    // ... logic ...
    log("amount: " + amount)
  }
}

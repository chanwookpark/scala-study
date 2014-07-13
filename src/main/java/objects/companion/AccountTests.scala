package objects.companion

/**
 * Created by chanwook on 2014. 7. 14..
 */
object AccountTest {

  def main(args: Array[String]) {
    val a = new Account
    assert(1 == a.id)
    assert(100.0 == a.deposit(100.0))
    assert(200.0 == a.deposit(100.0))
  }
}

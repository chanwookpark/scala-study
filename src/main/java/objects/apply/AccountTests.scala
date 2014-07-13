package objects.apply

/**
 * Created by chanwook on 2014. 7. 14..
 */
object AccountTest {

  def main(args: Array[String]) {
    val a = Account(100.0)
    assert(1 == a.id)
    assert(200.0 == a.deposit(100.0))
    assert(300.0 == a.deposit(100.0))
  }
}

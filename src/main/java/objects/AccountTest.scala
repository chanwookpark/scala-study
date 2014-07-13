package objects

/**
 * Created by chanwook on 2014. 7. 14..
 */
object AccountTest {

  def main(args: Array[String]) {
    // Singleton object
    assert(1 == Account.newUniqueNumber)
    assert(2 == Account.newUniqueNumber)
    assert(3 == Account.newUniqueNumber)

  }
}

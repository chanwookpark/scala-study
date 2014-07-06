package clazz

/**
 * Created by chanwook on 2014. 7. 7..
 */
object CounterTest {

  def main(args: Array[String]) {

    val c = new Counter
    assert(0 == c.current)
    c.increment()
    assert(1 == c.current)

    val c1 = new CounterForPrivateField
    val c2 = new CounterForPrivateField
    c2.increment()
    assert(0 == c1.current)
    assert(1 == c2.current)
    assert(true == c1.isLess(c2))

  }
}

package map

/**
 * Created by chanwook on 2014. 7. 7..
 */
object ZippingTest {

  def main(args: Array[String]) {
    println(">>" + getClass.getName)

    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)

    assert(("<", 2) == pairs(0))
    assert(("-", 10) == pairs(1))
    assert((">", 2) == pairs(2))
  }

}

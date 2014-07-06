package map

/**
 * Created by chanwook on 2014. 7. 7..
 */
object TupleTest {

  def main(args: Array[String]) {
    println(">>" + getClass.getName)

    val t1 = (1, 3.14, "woojin")
    // tuple index는 1에서부터 시작함!
    assert(1 == t1._1)
    assert(3.14 == t1._2)
    assert("woojin" == t1._3)
  }
}

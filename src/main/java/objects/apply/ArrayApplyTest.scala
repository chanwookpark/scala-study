package objects.apply

/**
 * Created by chanwook on 2014. 7. 14..
 */
object ArrayApplyTest {

  def main(args: Array[String]) {
    // Array(100)은 Array.apply(100)를 호출해 숫자 100을 갖는 하나의 배열을 반환
    val a1 = Array(100)
    assert(1 == a1.length)
    assert(100 == a1(0))

    // new Array(100)은 빈 Array 100개 인스턴스를 생성
    val a2 = new Array(100)
    assert(100 == a2.length)
    assert(null == a2(0))
    assert(null == a2(99))
  }
}

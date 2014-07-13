package extend.wwith

/**
 * Created by chanwook on 2014. 7. 14..
 */
object CreateOrderingTest {

  def main(args: Array[String]) {
    // env 생성 시에 'range' 값을 구하기 위해 range의 getter 함수를 호출하는 데,
    // 이 getter를 제공하는 Ant 클래스는 아직 초기화 되기 전(env가 상위 클래스에 있으므로..)이라 Int 변수의 초기값인 0을 반환함
    val ant = new Ant
    assert(0 == ant.env.length)

    // 'with'를 사용해 해결
    val bug = new Bug
    assert(5 == bug.env.length)

    // with 보다는 range를 final로 정의하던가 슈퍼클래스에서 range를 lazy로 선언하던가..
    val m = new Monkey
    assert(2 == m.env.length)
  }
}

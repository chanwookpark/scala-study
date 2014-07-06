package clazz

/**
 * Created by chanwook on 2014. 7. 7..
 */
class CounterForPrivateField {

  private var value = 0

  def increment() {
    value += 1
  }

  // ()를 메서드 정의 시에 사용하지 않으면 사용할 때도 ()를 사용할 수 없다. 강제하기.
  def current = value

  //동일 접근을 막고 싶을 때는 private[this]
  def isLess(other: CounterForPrivateField) = value < other.value

}

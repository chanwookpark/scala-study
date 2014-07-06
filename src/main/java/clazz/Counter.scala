package clazz

/**
 * Created by chanwook on 2014. 7. 7..
 */
class Counter {

  private var value = 0

  def increment() {
    value += 1
  }

  // ()를 메서드 정의 시에 사용하지 않으면 사용할 때도 ()를 사용할 수 없다. 강제하기.
  def current = value

}

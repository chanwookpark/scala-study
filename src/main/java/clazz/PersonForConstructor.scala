package clazz

/**
 * Created by chanwook on 2014. 7. 7..
 */
class PersonForConstructor {

  private var _name = ""
  private var _age = 0

  def this(name: String) {
    this() // 기본 생성자 호출
    this._name = name;
  }

  def this(name: String, age: Int) {
    this(name);
    this._age = age;
  }

  def age = _age

  def name = _name

}

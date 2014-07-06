package clazz

/**
 * Created by chanwook on 2014. 7. 7..
 */
class PersonForGetterAndSetter {

  var age = 0

  def privateAge = age

  def privateAge_=(newValue: Int) {
    if (newValue > age) age = newValue;
  }
}

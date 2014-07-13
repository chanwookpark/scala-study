package extend

/**
 * Created by chanwook on 2014. 7. 14..
 */
class Employee(name: String, age: Int, val salary: Double) extends Person(name, age) {
  override def id: Int = 0
}

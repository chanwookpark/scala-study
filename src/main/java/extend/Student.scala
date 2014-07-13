package extend

/**
 * Created by chanwook on 2014. 7. 14..
 */
class Student(name: String, override val id: Int) extends Person(name, age = 10) {

}

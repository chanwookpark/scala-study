package extend

/**
 * Created by chanwook on 2014. 7. 14..
 */
object ExtendsTest {

  def main(args: Array[String]) {
    // 타입검사
    var p = new Employee("chanwook", 32, 10000000000.0)
    assert(true == p.isInstanceOf[Employee])
    assert("chanwook" == p.name)
    assert(32 == p.age)
    assert(10000000000.0 == p.salary)

    p = null
    assert(false == p.isInstanceOf[Employee])
    assert(null == p.asInstanceOf[Employee])

    val s = new Student("woojin", 10)
    assert(false == s.isInstanceOf[Employee])
    assert("woojin" == s.name)
    assert(10 == s.id)

    // Anonymous
    val anony = new Person("Anony", 100) {
      override def id: Int = 0

      def greeting = "Hello"
    }
    assert("Anony" == anony.name)
    assert(100 == anony.age)
    assert("Hello" == anony.greeting)

    // 추상 필드 예제
    val abs = new PersonForAbstractField {
      val id = 123
      var name = "seojin"
    }

    assert(123 == abs.id)
    assert("seojin" == abs.name)

  }
}

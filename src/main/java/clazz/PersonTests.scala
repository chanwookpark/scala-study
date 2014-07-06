package clazz

/**
 * Created by chanwook on 2014. 7. 7..
 */
object PersonTests {

  def main(args: Array[String]) {
    val p = new PersonForGetterAndSetter;

    // 기본 getter&setter
    assert(0 == p.age)
    p.age = 10
    assert(10 == p.age)

    // getter&setter 확장
    assert(10 == p.privateAge)
    p.privateAge = 5 // 더 어려서 불가능.
    p.privateAge = 20 // 가능
    assert(20 == p.privateAge)

    // @BeanProperty Test
    val bp = new PersonWithBeanProperty;
    bp.setName("seojin")
    assert("seojin" == bp.getName)

    // 보조 생성자 테스트
    val pc1 = new PersonForConstructor("seojin")
    val pc2 = new PersonForConstructor("woojin", 10)
    assert("seojin" == pc1.name)
    assert(0 == pc1.age)
    assert("woojin" == pc2.name)
    assert(10 == pc2.age)
  }
}

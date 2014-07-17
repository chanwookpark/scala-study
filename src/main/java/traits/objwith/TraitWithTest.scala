package traits.objwith

/**
 * Created by chanwook on 2014. 7. 17..
 */
object TraitWithTest {

  def main(args: Array[String]) {
    // trait 구현체를 객체 생성할 때 지정할 수 있음!
    val account1 = new SavingAccount with ConsoleLogger
    // 다른 객체 생성할 때는 이렇게 할 수 있겠지..
    val account2 = new SavingAccount with FileLogger
  }
}

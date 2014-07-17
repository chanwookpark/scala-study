package traits

/**
 * Created by chanwook on 2014. 7. 17..
 */
class ConsoleLogger extends Logger with Cloneable with Serializable {
  // implements가 아닌 extends라고!!
  // 하나 이상의 trait 상속이 필요하면 'with' 키워드 사용함

  // override 키워드 안 붙인다!
  def log(msg: String) {
    println(msg)
  }
}

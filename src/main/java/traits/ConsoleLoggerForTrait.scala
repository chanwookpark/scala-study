package traits

/**
 * Created by chanwook on 2014. 7. 17..
 */
trait ConsoleLoggerForTrait {

  // trait에는 구현체가 들어갈 수 있다
  def log(msg: String) {
    println("Console Log: " + msg)
  }
}

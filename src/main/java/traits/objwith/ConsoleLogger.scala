package traits.objwith

/**
 * Created by chanwook on 2014. 7. 17..
 */
trait ConsoleLogger extends Logged {

  override def log(msg: String) {
    println(msg)
  }

}

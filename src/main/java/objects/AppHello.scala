package objects

/**
 * Created by chanwook on 2014. 7. 14..
 */
// main을 정의하는 대신 App 트레이트를 상속
object AppHello extends App {

  if (args.length > 0)
    println("Hello, " + args(0) + "!")
  else
    println(("Hello, World!"))
}

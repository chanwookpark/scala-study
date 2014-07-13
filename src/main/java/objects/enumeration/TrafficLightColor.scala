package objects.enumeration

/**
 * Created by chanwook on 2014. 7. 14..
 */
object TrafficLightColor extends Enumeration {

  type TrafficLightColor = Value

  val Red = Value(1, "Stop")
  val Yellow = Value(10)
  val Green = Value("Go")
}

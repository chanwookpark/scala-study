package objects.enumeration

import objects.enumeration.TrafficLightColor._

/**
 * Created by chanwook on 2014. 7. 14..
 */
object TrafficLightColorTest {

  def main(args: Array[String]) {
    assert(1 == Red.id)
    assert("Stop" == Red.toString)

    assert(10 == Yellow.id)
    assert("Yellow" == Yellow.toString)

    assert(11 == Green.id)
    assert("Go" == Green.toString)

    // 전체 리턴
    for (c <- TrafficLightColor.values) println(c.id + " : " + c)

    // enum 가져오기
    assert(Red == TrafficLightColor(1))
    assert(Green == TrafficLightColor.withName("Go"))

  }
}

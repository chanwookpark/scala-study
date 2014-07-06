package map

import java.util

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.JavaConversions.propertiesAsScalaMap

/**
 * Created by chanwook on 2014. 7. 7..
 */
object JavaMapToScalaTest {

  def main(args: Array[String]) {

    // JavaMap -> ScalaMap
    val scores: scala.collection.mutable.Map[String, Int] = new util.TreeMap[String, Int]();

    assert(null != scores)

    // Java Properties -> ScalaMap
    val props : scala.collection.Map[String, String] = System.getProperties()
    assert(null != props)


  }
}

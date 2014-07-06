package map

import scala.collection.mutable

/**
 * Created by chanwook on 2014. 7. 7..
 */
object MapTest {

  def main(args: Array[String]) {

    // (a,b)와 a->b 동일한 표현
    /* Immutable map */
    val iscores = Map("chanwook" -> 10, "seojin" -> 20, "woojin" -> 30)

    // get
    assert(10 == iscores("chanwook"))

    // contains
    if(iscores.contains("seojin")) assert(20 == iscores("seojin")) else 0
    assert(0 == iscores.getOrElse("seojin2", 0))

    // loop
    println(">> loop for map")
    for((key, value) <- iscores) println(key + ": " + value)

    // key loop
    println(">> key loop for map")
    for(k <- iscores.keySet) println(k)

    // vlaue loop
    println(">> value loop for map")
    for(v <- iscores.values) println(v)

    /* Mutable map */
    val mscores = scala.collection.mutable.Map("chanwook" -> 10, "seojin" -> 20, "woojin" -> 30)

    // 수정
    mscores("woojin") = 50
    assert(50 == mscores("woojin"))

    // 추가
    mscores("joo") = 5
    assert(5 == mscores("joo"))

    // 여러 값을 동시에
    mscores += ("player1" -> 100, "player2" -> 200)
    assert(100 == mscores("player1"))
    assert(200 == mscores("player2"))

    // 삭제
    mscores -= "player1"
    assert(false == mscores.contains("player1"))

    /* Empty map */
    val escore = new mutable.HashMap[String, Int]
  }
}

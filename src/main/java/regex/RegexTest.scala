package regex

/**
 * Created by chanwook on 2014. 7. 17..
 */
object RegexTest {

  def main(args: Array[String]) {
    val source: String = "99 bottles, 88 bottles"

    // 숫자
    val numPattern = "[0-9]+".r

    // 인용 부호가 있을 때는 """xxx""" 사용
    val wsnumwsPattern = """\s+[0-9]+\s+""".r

    // 매치 값 iterate
    for (matchString <- numPattern.findAllIn(source)) println(matchString)

    // 배열로 변환
    val arr = numPattern.findAllIn(source).toArray
    assert(2 == arr.length)
    println(arr(0))
    println(arr(1))

    // 첫 번째 매치 찾기
    val m1 = wsnumwsPattern.findFirstIn(source)
    println("m1: " + m1) // Some 타입?

    val m2 = numPattern.findPrefixOf(source)
    println("m2: " + m2)

    val m3 = wsnumwsPattern.findPrefixOf(source)
    println("m3: " + m3)

    // replace
    val m4 = numPattern.replaceFirstIn(source, "XX")
    println("m4: " + m4)

    val m5 = numPattern.replaceAllIn(source, "XX")
    println("m5: " + m5)

    // 그룹 처리
    val numItemPattern = "([0-9]+) ([a-z]+)".r
    for (numItemPattern(num, item) <- numItemPattern.findAllIn(source)) println("m6: "+ num + ", " + item)
  }
}

package file

import scala.io.Source

/**
 * Created by chanwook on 2014. 7. 14..
 */
object FileReadTest {
  final val ENCODING: String = "UTF-8"

  def main(args: Array[String]) {
    val file1: String = "./file/file1.txt"

    val source = Source.fromFile(file1, ENCODING)

    assert(true == (source != null))
    val lineIterator = source.getLines()

    // 줄 별 처리
    for (l <- lineIterator) println("LINE: " + l)

    // 줄을 배열로
    val lineArray = Source.fromFile(file1, ENCODING).getLines.toArray
    assert(3 == lineArray.length)

    // 줄 내용을 한 방에 받기
    val data = Source.fromFile(file1, ENCODING).mkString
    println(data)

    // 공백으로 구분된 모든 토큰을 읽기
    val tokens = Source.fromFile("./file/file2.txt", ENCODING).mkString.split("\\s+")
    for (t <- tokens) println("tokens: " + t)

    // iterator 리턴. 음절 별로 배열처리..
    val srcByUrl = Source.fromURL("http://wiki-camp.appspot.com/Home", ENCODING)
    for (s <- srcByUrl) println("url source: " + s)

    // iterator 리턴. 음절 별로 배열처리..
    val srcByString = Source.fromString("Hello, World! Why?!")
    for (s <- srcByString) println("string source: " + s)
  }
}

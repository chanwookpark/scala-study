package process

import java.io.File

import scala.sys.process._

/**
 * Created by chanwook on 2014. 7. 17..
 */
object ProcessTest {

  def main(args: Array[String]) {

    "ls -al .." !

    // 문자열로 받기
    val result = "ls -al .." !!

    // 연결해서 실행
    "ls -al .." #| "grep sec" !

    // 파일로 출력
    "ls -al .." #> new File("./file/process/output1.txt") !

    // 파일 삭제하지 않고 이어서 쓰기
    "ls -al .." #>> new File("./file/process/output1.txt") !

    // 입력을 파일로부터 리다이렉트???
    "grep sec" #< new File("./file/process/output1.txt") !

  }
}

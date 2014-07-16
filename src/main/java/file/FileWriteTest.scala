package file

import java.io.{File, FileInputStream, PrintWriter}

import scala.io.Source

/**
 * Created by chanwook on 2014. 7. 14..
 */
object FileWriteTest {

  final val FILE_NAME: String = "newFile1.txt"

  def main(args: Array[String]) {
    val fileOut = new PrintWriter(FILE_NAME)
    for (i <- 1 to 100) fileOut.println((i))
    fileOut.close

    val fileIn = Source.fromFile(FILE_NAME)
    for (i <- fileIn) println("read: " + i)

    // 바이너리 파일 읽기
    val file = new File(FILE_NAME);
    val in = new FileInputStream(file);
    val bytes = new Array[Byte](file.length().toInt)
    in.read(bytes);

    print("바이너리 읽기: " + new String(bytes))

    in.close()


  }
}

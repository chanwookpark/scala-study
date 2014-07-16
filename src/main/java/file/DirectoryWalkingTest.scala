package file

import java.io.File

/**
 * Created by chanwook on 2014. 7. 16..
 */
object DirectoryWalkingTest {

  def main(args: Array[String]) {
    // Iterator를 사용해서..

    for (d <- subdirs(new File("file"))) println(d.getName)
  }

  def subdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }
}

package objects

/**
 * Created by chanwook on 2014. 7. 14..
 */
object Account {

  private var lastNumber = 0

  def newUniqueNumber = {
    lastNumber += 1; lastNumber
  }

}

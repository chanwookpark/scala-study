package objects.extendsabstract

/**
 * Created by chanwook on 2014. 7. 14..
 */
abstract class UndoableAction(val description: String) {

  def undo(): Unit

  def redo(): Unit
}

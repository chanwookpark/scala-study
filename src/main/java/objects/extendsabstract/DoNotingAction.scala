package objects.extendsabstract

/**
 * Created by chanwook on 2014. 7. 14..
 */
object DoNothingAction extends UndoableAction("Do Nothing") {

  override def undo() = {
    description
  }

  override def redo() = {
    description
  }
}

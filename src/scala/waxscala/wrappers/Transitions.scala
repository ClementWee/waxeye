package waxscala.wrappers

object Transitions {
  sealed trait ITransition
  
  case class AutomationTransition(id: Int) extends ITransition
  case class CharTransition(str: String) extends ITransition
  case class CharClassTransition(singles: String, ranges: List[(Int, Int)])
}
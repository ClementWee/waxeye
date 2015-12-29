package waxscala

sealed trait ITransition

case class AutomationTransition(nextFA: Int)
case class CharClassTransition(singles: List[Char], ranges: List[(Int, Int)])
case class SingleCharTransition(char: Char)
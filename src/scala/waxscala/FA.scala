package waxscala

trait TokenType

case class Edge(transition: ITransition, state: Int, isVoided: Boolean)
case class State(edges: List[Edge], isMatch: Boolean)
case class FA(automatonType: TokenType, states: List[State], mode: FA.Mode)

object FA {
  sealed trait Mode
  case object VOID extends Mode
  case object PRUNE extends Mode
  case object LEFT extends Mode
  case object POS extends Mode
  case object NEG extends Mode
}
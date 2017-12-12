package datastructures.singlylinkedlist

sealed trait Node
case object Nil extends Node

final case class Cons(v: Int) extends Node {
  def value: Int = v
  var next: Node = Nil
}


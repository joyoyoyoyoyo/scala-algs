package datastructures.singlylinkedlist

sealed trait Node[Int]
case object Nil extends Node[Nothing]

final case class Cons[Int](v: Int) extends Node[Int] {
  def value: Int = v
  def next: Node[Nothing] = Nil
}


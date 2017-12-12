package datastructures.singlylinkedlist

final case class Node[+A](v: A) {
  def value: A = v
}

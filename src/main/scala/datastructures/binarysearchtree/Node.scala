package datastructures.binarysearchtree

sealed trait Node {
  def depth: Int = -1
  def height: Int = 0
  def visited: Boolean = false
}

case object Leaf extends Node

case class BinarySearchTree(value: Int, left: Node, right: Node) extends Ordered[BinarySearchTree] with Node {
  override def compare(that: BinarySearchTree): Int = this.value - that.value
}

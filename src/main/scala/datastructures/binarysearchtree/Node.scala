package datastructures.binarysearchtree

sealed trait Node

case object Leaf extends Node

case class BinarySearchTree(value: Int, left: Node, right: Node) extends Ordered[BinarySearchTree] with Node {
  override def compare(that: BinarySearchTree): Int = this.value - that.value
}

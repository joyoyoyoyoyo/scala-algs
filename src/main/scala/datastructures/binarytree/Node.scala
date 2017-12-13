package datastructures.binarytree

sealed trait Node

case object Leaf extends Node

case class Tree(val value: Int, left: Node, right: Node) extends Ordered[Tree] with Node {
  override def compare(that: Tree): Int = this.value - that.value
}

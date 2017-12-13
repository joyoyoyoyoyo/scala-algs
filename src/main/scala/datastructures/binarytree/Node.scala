package datastructures.binarytree

case class Node(value: Int) extends Ordered[Node] {

  val left = None
  val right = None


  override def compare(that: Node): Int = this.value - that.value

}

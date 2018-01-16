package datastructures.binarysearchtree

/** For any node n_i **/
sealed trait Node {
  /** The depth of n_i is the length of the unique path from the root to n_i [1] **/
  def depth: Int = -1

  /** [1] **/
  def height: Int = 0
  def visited: Boolean = false
}

case object Leaf extends Node

case class BinarySearchTree(
    value: Int,
    left: Node,
    right: Node)
  extends Ordered[BinarySearchTree] with Node {


  override def compare(that: BinarySearchTree): Int = this.value - that.value


}



/** Bibliography
  * [1] Weis, Mark, 'Data Structures and Algorithm Analysis in C++' Fourth Edition, 2014
  *   Pearson. Weis 122
  */
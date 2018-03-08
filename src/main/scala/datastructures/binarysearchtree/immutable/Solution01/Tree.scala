package datastructures.binarysearchtree.immutable.Solution01

/** For any node n_i **/
sealed trait Node {
  def depth: Int = -1  // The depth of n_i is the length of the unique path from the root to n_i [1].
  def height: Int = 0  // The height of n_i is the longest path from n_i to a leaf [1].
  def visited: Boolean = false
}

case object Leaf extends Node

case class Tree(value: Int, left: Node, right: Node) extends Ordered[Tree] with Node {


  override def compare(that: Tree): Int = this.value - that.value


}



/** Bibliography
  * [1] Weis, Mark, 'Data Structures and Algorithm Analysis in C++' Fourth Edition, 2014
  *   Pearson. Weis 122
  */
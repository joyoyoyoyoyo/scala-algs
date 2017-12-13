package datastructures.binarytree

import org.scalatest.FlatSpec

class NodeTest extends FlatSpec {
  "A Node" should "have ordering" in {
    val less = Tree(1, Leaf, Leaf)
    val more = Tree(2, Leaf, Leaf)
    assert(more > less)
  }
}

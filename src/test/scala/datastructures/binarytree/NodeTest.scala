package datastructures.binarytree

import org.scalatest.FlatSpec

class NodeTest extends FlatSpec {
  "A Node" should "have ordering" in {
    val less = Node(1)
    val more = Node(2)
    assert(more > less)
  }
}

package datastructures.binarysearchtree

import org.scalatest.FlatSpec

class NodeTest extends FlatSpec {
  "A BinarySearchTree" should "have ordering" in {
    val one = BinarySearchTree(1, Leaf, Leaf)
    val two = BinarySearchTree(2, Leaf, Leaf)
    val twoCopy = BinarySearchTree(2, Leaf, Leaf)
    val oneCopy = BinarySearchTree(1, Leaf, Leaf)
    assert(two > one)
    assert(one < two)
    assert(two != one)
    assert(two >= one)
    assert(one <= two)
    assert(two == twoCopy)
    assert(one == oneCopy)
  }

  "A Binary Search Tree" should "not allow for invalid sorting" in {

    val invalid = BinarySearchTree(
          value = 2,
          left=BinarySearchTree(3, Leaf, Leaf),
          right = BinarySearchTree(2, Leaf, Leaf)
      )

    assert(invalid == None)

  }
}

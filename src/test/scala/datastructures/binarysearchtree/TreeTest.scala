package datastructures.binarysearchtree

import datastructures.binarysearchtree.immutable.Solution01.{Leaf, Tree}
import org.scalatest.FlatSpec

class TreeTest extends FlatSpec {
  "A BinarySearchTree" should "have ordering" in {
    val one = Tree(1, Leaf, Leaf)
    val two = Tree(2, Leaf, Leaf)
    val twoCopy = Tree(2, Leaf, Leaf)
    val oneCopy = Tree(1, Leaf, Leaf)
    assert(two > one)
    assert(one < two)
    assert(two != one)
    assert(two >= one)
    assert(one <= two)
    assert(two == twoCopy)
    assert(one == oneCopy)
  }

  //TODO: Fix
  //TODO: Ask myself, how can I represent an unperformed object construction because of invalid requirements?
  "A Binary Search Tree" should "not allow for invalid sorting" in {
    val invalid = Tree(
          value = 2,
          left=Tree(3, Leaf, Leaf),
          right = Tree(2, Leaf, Leaf)
    )
    fail()
    assert(invalid == None)
  }

  "Root node" should "have a depth of 0" in {
    val simpleBst = Tree(
      value=20,
      left=Tree(-100, Leaf, Leaf),
      right=Tree(1000, Leaf, Leaf)
    )
    fail()
    assert(simpleBst.depth == 0)
  }

  //TODO: Why should a leaf in a bst begin with depth -1?
  "A Leaf" should "begin with depth -1 " in {
    val leaf = Leaf
    assert(leaf.depth == -1)
  }
}

package datastructures.binarysearchtree.solution1

/***
  * Attempt at a generic BST in Scala
  * @tparam A
  */

sealed trait GenericBinarySearchTree[+A] {
  def insert[B <: Ordered[A]](element: B): GenericBinarySearchTree[B] = {
    this match {
      case Leaf => Node(element, Leaf, Leaf)
      case Node(v, l, r) if element < v => Node(v, insert(l), r)
      case Node(v, l, r) if element > v => Node(v, l, insert(r))
      case Node(v, l, r) if element == v => this
    }
  }
}

case class Node[+A](element: A, left: GenericBinarySearchTree[A], right: GenericBinarySearchTree[A]) extends GenericBinarySearchTree[A] {
  def isEmpty = false
}


case object Leaf extends GenericBinarySearchTree[Nothing] {
}
package hackerrank.datastructures

import scala.annotation.tailrec

abstract class Tree[+A]
case class Branch[+A](value: A, left: Tree[A], right: Tree[A]) extends Tree[A]
case object Leaf extends Tree[Nothing]


object Tree {



  def preOrder[T](root : Tree[T]): Tree[T] = {

    root match {
      case Branch(value, left, right) => { println(value); preOrder(left); preOrder(right) }
      case Leaf => None
    }
    root
  }
  preOrder(Branch(1, Branch(2, Branch(8, Leaf, Leaf), Branch(5, Leaf, Leaf)), Branch(-2, Branch(-100, Leaf, Leaf), Leaf)))
}

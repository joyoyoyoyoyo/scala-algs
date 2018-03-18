package datastructures.binarysearchtree.immutable.solution00

abstract class Tree[+A]
case class Node[+A](value: A, left: Tree[A], right: Tree[A]) extends Tree[A]
case object Leaf extends Tree[Nothing]

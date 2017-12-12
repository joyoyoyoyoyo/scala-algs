package datastructures.singlylinkedlist

abstract class SinglyLinkedList[Int] {

  def head: Cons[Int]
  def next: Cons[Int]

  def add(v: Int): Unit
  def remove(v: Int): Unit
  def findKth(index: Int): Unit
  def appendToHead(v: Int): Unit
  def appendToTail(v: Int): Unit

}


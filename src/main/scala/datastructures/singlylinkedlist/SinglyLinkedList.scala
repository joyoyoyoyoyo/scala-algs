package datastructures.singlylinkedlist

abstract class SinglyLinkedList[A] {

  def head: Node[A]
  def next: Node[A]

  def add(v: A): Unit
  def remove(v: A): Unit
  def findKth(v: Int): Unit
  def appendToHead(v: A): Unit
  def appendToTail(v: A): Unit

}


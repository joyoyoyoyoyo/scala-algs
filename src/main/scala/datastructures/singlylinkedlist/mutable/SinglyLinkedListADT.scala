package datastructures.singlylinkedlist.mutable

abstract class SinglyLinkedListADT {

  def head: Node
  def next: Node

  // O(n)
  def add(v: Int): Unit

  // O(n)
  def remove(v: Int): Unit

  // O(n)
  def findKth(index: Int): Unit

  // O(1)
  def appendToHead(v: Int): Unit

  // O(n), assumes no tail, as defined in the ADT members above
  def appendToTail(v: Int): Unit

}


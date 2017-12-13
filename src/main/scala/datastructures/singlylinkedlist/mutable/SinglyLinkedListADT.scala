package datastructures.singlylinkedlist.mutable

abstract class SinglyLinkedListADT {

  def head: Node
  def next: Node

  def add(v: Int): Unit
  def remove(v: Int): Unit
  def findKth(index: Int): Unit
  def appendToHead(v: Int): Unit
  def appendToTail(v: Int): Unit

}


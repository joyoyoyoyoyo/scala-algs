package datastructures.singlylinkedlist.mutable

object SinglyLinkedList {


  class SinglyLinkedList {

    var head: Node = Nil

    def remove(v: Int): Unit = ???

    def findKth(index: Int): Int = ???

    /** Create a new node and insert the new node into the head, with the next pointer
      * pointing to the rest of the linked list
      **
      * Worst-case time complexity is O(1)
      *
      * @param v
      */
    def prepend(v: Int): Unit = {
      head = head match {
        case Nil => Cons(v, Nil)
        case prev: Cons => Cons(v, prev)
      }
    }

    import scala.annotation.tailrec

    /** A mutable implementation,
      * since this method does not require making a direct copy of the LinkedList
      *
      * Worst-case time complexity is O(N) for an N-element linked list
      * Space-complexity is O(N), since we begin with N elements and append 1 additional element O(N+1) ~= O(N)
      *
      * @param v
      */
    def append(v: Int): Unit = appendToTail(v, head)

    @tailrec
    private def appendToTail(v: Int, node: Node): Node = {
      node match {
        case last: Cons if last.next == Nil =>  last.next = Cons(v,Nil); last.next
        case Nil => head = Cons(v, Nil); head
        case list: Cons => appendToTail(v, list.next)
      }
    }
  }

  sealed trait Node

  final case object Nil extends Node

  final case class Cons(v: Int, var next: Node) extends Node {
    def value: Int = v
  }


}
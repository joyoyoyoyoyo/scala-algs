package datastructures.singlylinkedlist.mutable

object SinglyLinkedList {
  import scala.annotation.tailrec


  class SinglyLinkedList {


    var head: Option[Cons] = None

    def remove(v: Int): Unit = {

      @tailrec
      def search(v: Int, node: Option[Cons]): Option[Node] = {
        node match {
          case None => None
          case Some(next) if next.value == v => node.get.next = next.next; node.get.next
          case Some(next) => search(v, Some(next))
        }
      }
      search(v, head)
    }

    def findKth(index: Int): Int = ???

    /** Create a new node and insert the new node into the head, with the next pointer
      * pointing to the rest of the linked list
      **
      * Worst-case time complexity is O(1)
      *
      * @param v
      */
//    def prepend(v: Int): Unit = {
//      head = head match {
//        case Nil => Cons(v, Nil)
//        case prev: Cons => Cons(v, prev)
//      }
//    }

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

  final case class Cons(v: Int, var next: Option[Node]) extends Node {
    val value: Int = v
  }


}
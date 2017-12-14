package datastructures.singlylinkedlist.mutable

object SinglyLinkedList {
  import scala.annotation.tailrec

  class SinglyLinkedList {

    var head: Node = Nil

    /**
      * O(n) algorithm
      * @param v
      */
    def remove(v: Int): Unit = {
      head = head match {
        case Nil => Nil
        case Cons(vv, Nil) if vv == v => Nil
        case Cons(vv, Nil) => Cons(vv, Nil)
        case next: Cons => Cons(next.v, removeRecursive(v, next.next))
      }
    }

    @tailrec
    private def removeRecursive(v: Int, current: Node): Node = {
      current match {
        case Cons(vv, Nil) if vv == v  => Nil
        case Cons(vv, Nil) => Cons(vv, Nil)
        case Cons(e, Cons(vvv, next)) if vvv == v => Cons(e, next)
        case Cons(e, Cons(vvv, next)) if vvv == v => removeRecursive(v, next)
      }
    }

    /**
      * O(n) algorithm because of traversal from head to the kth node
      * @param index
      * @return
      */
    def findKth(index: Int): Int = {
      require(index > 0)
      findKthHelper(index, head)
    }

    private def findKthHelper(index: Int, n: Node): Int = {
      (index, n) match {
        case (x, Nil) => -1
        case (i, xs: Cons) if i == 0 => xs.v
        case (i, xs: Cons) => findKthHelper(i - 1, xs.next)
      }
    }

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
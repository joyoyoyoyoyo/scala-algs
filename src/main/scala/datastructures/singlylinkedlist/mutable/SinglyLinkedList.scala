package datastructures.singlylinkedlist.mutable

class SinglyLinkedList {


  var head: Node = Nil

  def remove(v: Int): Unit = ???

  def findKth(index: Int): Int = ???

  /** Create a new node and insert the new node into the head, with the next pointer
    * pointing to the rest of the linked list
    *
    * Also known as the prepend operation
    *
    * Worst-case time complexity is O(1)
    *
    * @param v
    */
  def appendToHead(v: Int): Unit = {
    val node = Cons(v)
    head = head match {
      case Nil => node
      case x: Cons =>  { node.next = head; node }
    }
  }

  import scala.annotation.tailrec

  /** A mutable implementation,
    * since this method does not require making a direct copy of the LinkedList
    *
    * Worst-case time complexity is O(N) for an N-element linked list
    * Space-complexity is O(N), since we begin with N elements and append 1 additional element O(N+1) ~= O(N)
    * @param v
    */
  def appendToTail(v: Int): Unit = {

    @tailrec
    def search(v: Int, node: Node): Cons = {
      node match {
        case current: Cons if current.next == Nil => current
        case current: Cons => search(v, current.next)
      }
    }

    val lastElement = search(v, head)
    lastElement.next = Cons(v)
  }
}

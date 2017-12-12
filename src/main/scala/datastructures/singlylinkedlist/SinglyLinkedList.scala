package datastructures.singlylinkedlist

class SinglyLinkedList(val head: Node) {

  def next: Node = Nil

  def remove(v: Int): Unit = ???

  def findKth(index: Int): Unit = ???

  def appendToHead(v: Int): Unit = ???


  /** A mutable implementation,
    * since this method does not require making a direct copy of the LinkedList
    *
    * Worst-case time complexity is O(N) for an N-element linked list
    * Space-complexity is O(N), since we begin with N elements and append 1 additional element O(N+1) ~= O(N)
    * @param v
    */
  def appendToTail(v: Int): Unit = {
    val lastElement = search(v, head)
    lastElement.next = Cons(v)

    @scala.annotation.tailrec
    def search(v: Int, node: Node): Cons = {
      node match {
        case current: Cons if current.next == Nil => current
        case current: Cons => search(v, current.next)
      }
    }
  }
}

package leetcode


/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
object Solution002 {

  /**
    * Definition for singly-linked list.
    * class ListNode(var _x: Int = 0) {
    * var next: ListNode = null
    * var x: Int = _x
    * }
    */
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var carry = 0
    var dummyHead = new ListNode()
    var current = dummyHead
    var p1 = l1
    var p2 = l2
    while (p1 != null || p2 != null) {
      val x = if (p1 == null) 0 else p1.x
      val y = if (p2 == null) 0 else p2.x
      val sum = x + y + carry
      carry = sum / 10
      current.next = new ListNode(sum % 10)
      current = current.next
      if (p1 != null) p1 = p1.next
      if (p2 != null) p2 = p2.next
    }

    if (carry > 1) {
      current.next = new ListNode(1)
    }

    dummyHead.next

  }

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

}

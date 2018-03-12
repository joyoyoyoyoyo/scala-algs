package datastructures.priorityqueue

import scala.reflect.{ClassTag, Manifest}


/**
  * Created by: Angel Ortega
  * Date: 2/18/18
  */
class MaxBinaryHeap(private val capacity: Int = 100) extends MaxPQ[Int](Array.ofDim(capacity)) {
  /**
    * Create a priority queue of initial capacity max
    */

  private[this] var _size = 0
  private[this] def getParentIndex(index: Int) = math.floor((index - 1)/ 2).toInt
  private[this] def getLeftChildIndex(index: Int) = (index * 2) + 1
  private[this] def getRightChildIndex(index: Int) = (index * 2) + 2


  /**
    * Insert a key into the Priority Queue
    * Time Complexity: O(log(n))
    */
  override def insert(v: Int): Unit = {
    pq(size) = v
    // move child to leftmost, bottommost path,
    //   obeying balance property

    var curr = size
    // check parent index for heap order property, that is,
    //   no child should be greater than it's parent
    while (pq(getParentIndex(curr)) < pq(curr)) {
      // swap if binary heap order property violated
      //   recurse until child is not greater than it's parent
      exch(getParentIndex(curr), curr)
      curr = getParentIndex(curr)
    }

    // update n-node size of binary heap
    _size += 1
  }


  private[this] def exch(aIndex: Int, bIndex: Int): Unit = {
    val swap = pq(aIndex)
    pq(aIndex) = pq(bIndex)
    pq(bIndex) = swap
  }

  /**
    * Return and remove the largest key
    */
  override def delMax(): Int = {
    val root = pq(0)
    _size -= 1
    pq(0) = pq(size)
    pq(size) = 0

    var idx = 0
    while (hasLeftChild(idx)) {
      val left = pq(getLeftChildIndex(idx))
      val maxChildIdx =
        if (hasRightChild(idx) && getRightChildIndex(idx) < size) {
          val right = pq(getRightChildIndex(idx))
          if (left > right)
            getLeftChildIndex(idx)
          else
            getRightChildIndex(idx)
        }
        else {
          getLeftChildIndex(idx)
        }

      exch(maxChildIdx, idx)
      idx = maxChildIdx
    }
    root
  }

  private def hasLeftChild(idx: Int): Boolean = getLeftChildIndex(idx) <= size
  private def hasRightChild(idx: Int): Boolean = getRightChildIndex(idx) <= size



  /**
    * Is the priority queue empty?
    */
  override def isEmpty: Boolean = ???

  /**
    * Return the largest key
    */
  override def max: Int = ???

  /**
    * Number of entries in the priority queue
    */
  override def size: Int = _size

  override def toString: String = {
    s"MaxBinaryHeap=" + pq.mkString("[", ", ", "]")
  }
}

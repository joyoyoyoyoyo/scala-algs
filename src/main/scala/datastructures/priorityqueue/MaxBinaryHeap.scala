package datastructures.priorityqueue

import scala.reflect.ClassTag


/**
  * Created by: Angel Ortega
  * Date: 2/18/18
  */
class MaxBinaryHeap[K : Ordering : ClassTag](val capacity: Int = 100) extends MaxPQ[K] {
  /**
    * Create a priority queue of initial capacity max
    */
  private[this] val pq = Array.ofDim[K](capacity)
  private[this] var _size = 0

  private[this] def parent(index: Int) = math.floor(index / 2).toInt
  private[this] def left(index: Int) = (index * 2) + 1
  private[this] def right(index: Int) = (index * 2) + 2


  /**
    * Insert a key into the Priority Queue
    */
  override def insert[B <: K](v: B): Unit = {
    pq(size) = v
    // move child to leftmost, bottommost path,
    //   obeying balance property

    var curr = size
    // check parent index for heap order proprty, that is,
    //   no child should be greater than it's parent
    while (implicitly[Ordering[K]].lt(pq(parent(curr)), pq(curr))) {
      // swap if binary heap order property violated
      //   recurse until child is not greater than it's parent
      exch(parent(curr), curr)
      curr = parent(curr)
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
  override def delMax[K](): K = ???

  /**
    * Is the priority queue empty?
    */
  override def isEmpty: Boolean = ???

  /**
    * Return the largest key
    */
  override def max[K]: K = ???

  /**
    * Number of entries in the priority queue
    */
  override def size: Int = _size
}

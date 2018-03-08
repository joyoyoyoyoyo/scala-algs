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

  private[this] def getParentIndex(index: Int) = math.floor(index / 2).toInt
  private[this] def getLeftChildIndex(index: Int) = (index * 2) + 1
  private[this] def getRightChildIndex(index: Int) = (index * 2) + 2


  /**
    * Insert a key into the Priority Queue
    */
  override def insert[B <: K](v: B): Unit = {
    // move child to leftmost, bottommost path,
    //   obeying balance property
    pq(size) = v

    def bubbleUp[B <: K](v: B, index: Int): Unit = {
      val parent = pq(getParentIndex(index))
      val current = pq(index)

      // parent < child, so swap
      // check parent index for heap order proprty, that is,
      //   no child should be greater than it's parent
      if (implicitly[Ordering[K]].lt(parent, current)) {
        // swap if binary heap order property violated
        //   recurse until child is not greater than it's parent
        exch(getParentIndex(index), index)
        bubbleUp(v, getParentIndex(index))
      }
    }

    bubbleUp(v, size)

    _size += 1 // update n-node size of binary heap
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

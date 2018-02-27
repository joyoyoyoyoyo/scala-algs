package datastructures.priorityqueue

/**
  * Created by: Angel Ortega
  * Date: 2/18/18
  */
class MaxBinaryHeap[K] extends MaxPQ[K] {

  private[this] var capacity = 0

  /**
    * Insert a key into the Priority Queue
    */
  override def insert[B <: K](v: B): Unit = {
    // move child to leftmost, bottommost path, 
    //   obeying balance property

    // check parent index for heap order proprty, that is, 
    //   no child should be greater than it's parent

    // swap if binary heap order property violated
    //   recurse until child is not greater than it's parent
    
    // on terminate, do nothing

    capacity += 1
  }

  /**
    * Return and remove the largest key
    */
  override def delMax[B <: K](): B = ???

  /**
    * Is the priority queue empty?
    */
  override abstract def isEmpty: Boolean = ???

  /**
    * Return the largest key
    */
  override def max[B <: K]: B = ???

  /**
    * Number of entries in the priority queue
    */
  override def size: Int = ???
}

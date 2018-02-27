package datastructures.priorityqueue

//TODO: Factory pattern for MaxBinaryHeap constructors
/**
  * Created by: Angel Ortega
  * Date: 2/18/18
  */
class MaxBinaryHeap[K] extends MaxPQ[K] {

  private[this] var size = 0
  private[this] val pq: Array[K]

  /**
    * Create a priority queue
    */
//  def this = ???


  /**
    * Create a priority queue of initial capacity max
    */
  def this(capacity: Int) = {
    pq = Array.ofDim[K](capacity)
  }

  /**
    * Create a priority queue from the keys in {{{a[]}}}
    */
  def this(a: Array[K]) = {
    pq = a.clone()
  }

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
    
    // on end recurse, percolate nothing
 
    // update n-node size of binary heap
    size += 1
  }

  /**
    * Return and remove the largest key
    */
  override def delMax[B <: K](): B = ???

  /**
    * Is the priority queue empty?
    */
  override def isEmpty: Boolean = ???

  /**
    * Return the largest key
    */
  override def max[B <: K]: B = ???

  /**
    * Number of entries in the priority queue
    */
  override def size: Int = ???
}

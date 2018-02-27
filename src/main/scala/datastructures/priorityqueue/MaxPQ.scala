package datastructures.priorityqueue
/**
  * Created by: Angel Ortega
  * Date: 2/18/18
  */
abstract class MaxPQ[K <: Ordered[K]] {

  /**
    * Create a priority queue with given keys
    */
//  abstract def this(a: Array[K])

  /**
    * Insert a key into the Priority Queue
    */
  abstract def insert[B <: K](v: B): Unit

  /**
    * Return and remove the largest key
    */
  abstract def delMax[B <: K](): B

  /** 
    * Is the priority queue empty?
    */
  abstract def isEmpty: Boolean

  /**
    * Return the largest key
    */
  abstract def max[B <: K]: B

  /**
    * Number of entries in the priority queue
    */
  abstract def size: Int
}

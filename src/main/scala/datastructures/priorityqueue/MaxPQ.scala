package datastructures.priorityqueue


/**
  * Created by: Angel Ortega
  * Date: 2/18/18
  */
abstract class MaxPQ[K] {
  /**
    * Create a priority queue with given keys
    */

  /**
    * Insert a key into the Priority Queue
    */
  def insert[B <: K](v: B): Unit

  /**
    * Return and remove the largest key
    */
  def delMax[B <: K](): B

  /**
    * Is the priority queue empty?
    */
  def isEmpty: Boolean

  /**
    * Return the largest key
    */
  def max[B <: K]: B

  /**
    * Number of entries in the priority queue
    */
  def size: Int
}
